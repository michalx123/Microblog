package com.wwsis.microblog.dao.impl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pl.wwsis.microblog.dao.WpisDao;
import pl.wwsis.microblog.model.Wpis;

public class WpisDaoImpl implements WpisDao{

	@PersistenceContext
	EntityManager  entityManager ;
	
	@Override
	public List<Wpis> getAllUsersMessages(int idUzytkownika) {
		Query query = entityManager.createQuery("SELECT * FROM wpis WHERE iduzytkownika= :idUzytkownika");
		query.setParameter("idUzytkownika",idUzytkownika) ;
		List<Wpis> wpisy = query.getResultList();
		return wpisy;
	}

	//do zrobienia
	@Override
	public List<Wpis> getAllUsersAndUserFollowersMessages(int idUzytkownika) {
		Query query = entityManager.createQuery("SELECT wpis as W,follower as F WHERE W.iduzytkownika=F.iduzytkownikasledzonego AND w.iduzytkownika=:idUzytkownika");
		List<Wpis> wpisy = query.getResultList();
		return wpisy;
		
		
	}

	@Override
	public List<Wpis> getEverything() {
		Query query = entityManager.createQuery("SELECT e FROM wpis e");
		List<Wpis> wpisy = query.getResultList();
		return wpisy;
	}

	@Override
	public void addMessage(int idUzytkownika, String message) {
		String hql  =  "INSERT INTO wpis (iduzytkownika,tekst)" + "SELECT :iduzytkownika, :message";
		Query query  = entityManager . createQuery ( hql );
		query.setParameter("iduzytkownika", idUzytkownika);
		query.setParameter("message", message);
		
	}

}
