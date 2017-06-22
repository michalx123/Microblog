package pl.wwsis.microblog.dao.impl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

//import org.hibernate.Session;

import pl.wwsis.microblog.dao.WpisDao;
import pl.wwsis.microblog.model.Wpis;

@Transactional
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

	
	@Override
	public List<Wpis> getAllUsersAndUserFollowersMessages(int idUzytkownika) {
		Query query = entityManager.createQuery("SELECT tekst FROM wpis W,follower F WHERE W.iduzytkownika=F.iduzytkownikasledzonego OR W.iduzytkownika=:idUzytkownika");
		List<Wpis> wpisy = query.getResultList();
		query.setParameter("iUzytkownika", idUzytkownika);
		return wpisy;
		
	}

	@Override
	public List<Wpis> getEverything() {
		Query query = entityManager.createQuery("SELECT tekst FROM wpis");
		List<Wpis> wpisy = query.getResultList();
		return wpisy;
	}

	@Override
	public void addMessage(int idUzytkownika, String message) {
		String hql  =  "INSERT INTO wpis (:iduzytkownika,:tekst)" + "SELECT iduzytkownika,message";
		Query query  = entityManager.createQuery(hql);
		query.setParameter("iduzytkownika", idUzytkownika);
		query.setParameter("message", message);
		query.executeUpdate();
		
	}

}
