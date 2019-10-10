package edu.pe.upn.Soluciones_T1.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="regions")
public class Regions {
	@Id	
	@Column(name = "region_Id")
	private String region_Id;
	
	@Column(name ="region_name",length = 25)
	private String region_name;
   
	@OneToMany(mappedBy ="country_Id",fetch = FetchType.LAZY)
	private List<Countries> countries;
    public Regions () {
    	countries =new ArrayList<>();
    }
	public String getRegion_Id() {
		return region_Id;
	}
	public void setRegion_Id(String region_Id) {
		this.region_Id = region_Id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public List<Countries> getCountries() {
		return countries;
	}
	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}
    
}
