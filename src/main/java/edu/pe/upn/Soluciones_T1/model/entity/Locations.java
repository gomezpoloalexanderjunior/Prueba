package edu.pe.upn.Soluciones_T1.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="locations")
public class Locations {
	@Id
	@Column(name = "location_Id", length =4 )
	private String location_Id;
	
	@Column(name = "street_Address", length =40 )
	private String street_Address;
	
	@Column(name = "postal_Code", length =12 )
	private String postal_Code;
	
	@Column(name = "city", length =30 )
	private String city;
	
	@Column(name = "state_province", length =25 )
	private String state_province;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_Id")
	private Countries  country;

	public String getLocation_Id() {
		return location_Id;
	}

	public void setLocation_Id(String location_Id) {
		this.location_Id = location_Id;
	}

	public String getStreet_Address() {
		return street_Address;
	}

	public void setStreet_Address(String street_Address) {
		this.street_Address = street_Address;
	}

	public String getPostal_Code() {
		return postal_Code;
	}

	public void setPostal_Code(String postal_Code) {
		this.postal_Code = postal_Code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}
	
	
}
