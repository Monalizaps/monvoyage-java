package com.monvoyage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.monvoyage.models.MonModel;
import com.monvoyage.repository.MonvoyageRepository;

@Controller

public class MonController {
	
	@Autowired
	public MonvoyageRepository mr;
	
	@RequestMapping(value="/cadastroMonVoyage", method=RequestMethod.GET)
	public String form() {
		return "MonVoyage/formMonVoyage";
	}
	
	@RequestMapping(value="/cadastroMonVoyage", method=RequestMethod.POST)
	public String form(MonModel monmodel) {
		
		mr.save(monmodel);
		
		return "redirect:/cadastroMonVoyage";
	}

}
