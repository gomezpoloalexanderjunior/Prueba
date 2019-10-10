package edu.pe.upn.Soluciones_T1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerIndex {

	
 @RequestMapping("/")
 public String Index () {
	 return "Index";
 }
 
 

 
 
 
}
