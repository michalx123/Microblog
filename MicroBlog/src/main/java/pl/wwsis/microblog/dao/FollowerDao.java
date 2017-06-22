package pl.wwsis.microblog.dao;

import java.util.List;

import pl.wwsis.microblog.model.Follower;

public interface FollowerDao {


	public void addFollowee(int idUzytkownika,int idFollowera);	
	public void deleteFollowee(int idUzytkownika,int idFollowera);
	public List<Follower> checkFollowers(int idUzytkownika);
	
	

}
