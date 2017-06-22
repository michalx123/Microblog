package pl.wwsis.microblog.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pl.wwsis.microblog.dao.UzytkownikDao;
import pl.wwsis.microblog.model.Wpis;

@Transactional
public class UzytkownikDaoImpl implements UzytkownikDao{

	@PersistenceContext
	EntityManager  entityManager ;
	
	@Override
	public String searchUserByLogin(int idUzytkownika) {
		Query query = entityManager.createQuery("SELECT imie,nazwisko FROM uzytkownik WHERE idUzytkownika=:idUzytkownika");
		query.setParameter("idUzytkownika",idUzytkownika);
		String uzytkownik = query.getSingleResult().toString();
		return uzytkownik;
	}

	@Override
	public void registerUser(String imie, String nazwisko) {
		String hql  =  "INSERT INTO follower (:imie,:nazwisko)" + "SELECT imie, nazwisko";
		Query query  = entityManager.createQuery(hql);
		query.setParameter("imie", imie);
		query.setParameter("nazwisko", nazwisko);
	}

}
