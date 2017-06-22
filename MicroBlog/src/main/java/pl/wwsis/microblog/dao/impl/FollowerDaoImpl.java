package pl.wwsis.microblog.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pl.wwsis.microblog.dao.FollowerDao;

@Transactional
public class FollowerDaoImpl implements FollowerDao{


	@PersistenceContext
	EntityManager  entityManager ;
	
	@Override
	public void addFollowee(int idUzytkownika, int idFollowera) {
		String hql  =  "INSERT INTO follower (-----)" + "SELECT ---";
		Query query  = entityManager.createQuery(hql);
		query.setParameter("idUzytkownika", idUzytkownika);
		query.setParameter("idFollowera", idFollowera);
		
	}

	@Override
	public void deleteFollowee(int idUzytkownika, int idFollowera) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkFollowers(int idUzytkownika) {
		// TODO Auto-generated method stub
		
	}

}
