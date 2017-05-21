package pl.wwsis.microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name= "uzytkownik" )
public class Uzytkownik {
	
	 @Id 
	 private int idUzytkownika;
	 
	 public int getIdUzytkownika() {
		return idUzytkownika;
	}

	public void setIdUzytkownika(int idUzytkownika) {
		this.idUzytkownika = idUzytkownika;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	@Column (name= "imie" , nullable= false )  
	 private String imie;
	 
	@Column (name= "nazwisko" , nullable= false )  
	 private String nazwisko;
	
	
	
}
