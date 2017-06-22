package pl.wwsis.microblog.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pl.wwsis.microblog.dao.FollowerDao;
import pl.wwsis.microblog.model.Follower;
import pl.wwsis.microblog.model.Wpis;

@Transactional
public class FollowerDaoImpl implements FollowerDao{


	@PersistenceContext
	EntityManager  entityManager ;
	
	@Override
	public void addFollowee(int idUzytkownika, int idFollowera) {
		String hql = "INSERT INTO follower (:idFollowera,:idUzytkownika)" + "SELECT idFollowera,iduzytkownikasledzonego";
		Query query = entityManager.createQuery(hql);
		query.setParameter("idFollowera", idFollowera);
		query.setParameter("idUzytkownika", idUzytkownika);
		query.executeUpdate();
		
	}

	@Override
	public void deleteFollowee(int idUzytkownika, int idFollowera) {

		String hql = "DELETE FROM follower WHERE :idFollowera = iduzytkownikasledzonego AND idFollowera = :idFollowera"; 
		Query query = entityManager.createQuery(hql); 
		query.setParameter("idUzytkownika",idUzytkownika);
		query.setParameter("idFollowera",idFollowera);
		query.executeUpdate();
	}

	@Override
	public List<Follower> checkFollowers(int idUzytkownika) {
		Query query = entityManager.createQuery("SELECT U.imie,U.nazwisko FROM uzytkownik U, follower F WHERE :idUzytkownika=F.iduzytkownikasledzonego");
		List<Follower> followers = query.getResultList();
		query.setParameter("iUzytkownika", idUzytkownika);
		return followers;

		
	}

}
