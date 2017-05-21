package pl.wwsis.microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name= "wpis" )
public class Wpis {
	
	 @Id 
	 private int idWpisu;
	 
	 @Column (name= "tekst" , nullable= false )  
	 private String tekst;
		
	
	 public int getIdWpisu() {
		return idWpisu;
	}

	public void setIdWpisu(int idWpisu) {
		this.idWpisu = idWpisu;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}



}
