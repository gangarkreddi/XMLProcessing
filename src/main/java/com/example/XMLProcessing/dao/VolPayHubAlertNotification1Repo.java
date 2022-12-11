package com.example.XMLProcessing.dao;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.XMLProcessing.dao.model.VolPayHubAlertNotification1Vo;

@Repository
public class VolPayHubAlertNotification1Repo {
	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(VolPayHubAlertNotification1Vo items) {

		try {
			VolPayHubAlertNotification1Vo obj = this.findObject(items.getUniqueReferenceId());
			if (obj == null) {
				entityManager.persist(items);
			} else {
				entityManager.merge(items);
			}

		} catch (EntityExistsException ex) {
			System.out.println("saveUpdate exception");
		}
	}

	private VolPayHubAlertNotification1Vo findObject(String refId) {
		VolPayHubAlertNotification1Vo obj = null;
		List<VolPayHubAlertNotification1Vo> list = VolPayHubAlertNotification1(
				entityManager
						.createQuery(" from VolPayHubAlertNotification1 notification"
								+ " where notification.UniqueReferenceId = :id")
						.setParameter("id", refId).getResultList());
		if (list != null && list.size() > 0)
			obj = list.stream().filter(element -> element.getUniqueReferenceId().equalsIgnoreCase(refId))
					.collect(Collectors.toList()).get(0);
		return obj;		
	}

	private List<VolPayHubAlertNotification1Vo> VolPayHubAlertNotification1(List resultList) {
		// TODO Auto-generated method stub
		return null;
	}
}
