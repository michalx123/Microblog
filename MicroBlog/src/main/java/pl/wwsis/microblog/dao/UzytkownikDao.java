package pl.wwsis.microblog.dao;

import java.util.List;

import pl.wwsis.microblog.model.Wpis;

public interface UzytkownikDao {
	
	
	public String searchUserByLogin(int idUzytkownika);
	
	public void registerUser(String imie,String nazwisko);
	
}
