package edu.pe.upn.Soluciones_T1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.pe.upn.Soluciones_T1.model.entity.Countries;
import edu.pe.upn.Soluciones_T1.service.CountriesService;

@Controller
@RequestMapping ("/Countries")
@SessionAttributes("/Countries")
public class ControllerCountries {
      @Autowired
	  private  CountriesService countriesService ;
     
      @GetMapping
     public String countries (Model model) throws Exception {
	 
	   List<Countries> countries =countriesService.findAll();
		
	  model.addAttribute("Countries",countries);
	
	
  return "/Countries/Countries";
  }

}