package com.Universities.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Universities.Model.UniversitiesModel;
import com.Universities.Server.UniversitiesServer;

@RestController
public class UniversitiesController {
	@Autowired
	private UniversitiesServer uniService;
	
	@PostMapping("/University")
	public void getSaveOneDat(@RequestBody UniversitiesModel uniMod) 
	{
		uniService.SaveOneData(uniMod);
	}
}
