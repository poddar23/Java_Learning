package model;

import jakarta.persistence.*;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="name",length = 20)
	String countryName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	president president;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public president getPresident() {
		return president;
	}

	public void setPresident(president president) {
		this.president = president;
	}
		
	
	
}
