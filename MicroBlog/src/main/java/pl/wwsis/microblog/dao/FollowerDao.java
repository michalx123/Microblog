package pl.wwsis.microblog.dao;


public interface FollowerDao {


	public void addFollowee(int idUzytkownika,int idFollowera);	
	public void deleteFollowee(int idUzytkownika,int idFollowera);
	public void checkFollowers(int idUzytkownika);
	
	

}
