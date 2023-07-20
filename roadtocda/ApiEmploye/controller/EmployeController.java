package com.roadtocda.ApiEmploye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.roadtocda.Api.employe.model.Employe;
import com.roadtocda.ApiEmploye.service.EmployeService;

public class EmployeController {
	
	@Autowired
	private EmployeService employeService;
	
	
	@GetMapping("/employe")
	public Iterable<Employe> getEmploye(){
		return EmployeService.getEmploye();
}
	
}