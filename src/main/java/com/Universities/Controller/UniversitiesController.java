package com.Universities.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Universities.Model.UniversitiesModel;
import com.Universities.Server.UniversitiesServer;

@RestController
public class UniversitiesController {
	@Autowired
	private UniversitiesServer uniService;
	
	@GetMapping("/University")
	public List<UniversitiesModel> getFindAll()
	{
		return uniService.findAll();
	}
	
	@GetMapping("/University/{Id}")
	public UniversitiesModel getFindOne(@PathVariable int Id) 
	{
		return uniService.findOne(Id);
	}
	
	@PostMapping("/University")
	public void getSaveOneDat(@RequestBody UniversitiesModel uniMod) 
	{
		uniService.SaveOneData(uniMod);
	}
	
	@PutMapping("/University/{Id}")
	public List<UniversitiesModel> getUpdateOne(@PathVariable int Id ,@RequestBody  UniversitiesModel uniMod)
	{
		return uniService.updateOne(Id, uniMod);
	}
	
}
