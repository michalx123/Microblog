package pl.wwsis.microblog.dao;

import java.util.List;

import pl.wwsis.microblog.model.Wpis;

public interface WpisDao {

	public List <Wpis> getAllUsersMessages(int idUzytkownika);
	
	public List <Wpis> getAllUsersAndUserFollowersMessages(int idUzytkownika);
	
	public List <Wpis> getEverything();
	
	public void addMessage(int idUzytkownika,String message);
	
	
}
