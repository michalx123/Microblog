package pl.wwsis.microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name= "follower" )

public class Follower {
	
	
	 @Id   
	 private int idFollowera;
	 
	 @Column (name= "iduzytkownikasledzonego", nullable=false )
	 private int idUzytkownikaSledzonego;
	 
	 @Column (name= "imie" , nullable= false )  
	 private String imie;
		 
	 @Column (name= "nazwisko" , nullable= false )  
	 private String nazwisko;
	 
	 public int getIdFollowera() {
		return idFollowera;
	}

	public void setIdFollowera(int idFollowera) {
		this.idFollowera = idFollowera;
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


	 
}
