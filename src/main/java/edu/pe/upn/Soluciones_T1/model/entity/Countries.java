package edu.pe.upn.Soluciones_T1.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name ="Countries")
public class Countries {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
private Integer country_Id;

@Column(name = "country_Name")
private String country_name;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn (name = "region_Id")
private Regions region;

@OneToMany(mappedBy = "location_Id")
private List<Locations> location;

public Countries () {
	location = new ArrayList<>();
   }

public Integer getCountry_Id() {
	return country_Id;
}

public void setCountry_Id(Integer country_Id) {
	this.country_Id = country_Id;
}

public String getCountry_name() {
	return country_name;
}

public void setCountry_name(String country_name) {
	this.country_name = country_name;
}

public Regions getRegion() {
	return region;
}

public void setRegion(Regions region) {
	this.region = region;
}

public List<Locations> getLocation() {
	return location;
}

public void setLocation(List<Locations> location) {
	this.location = location;
}

  
}
