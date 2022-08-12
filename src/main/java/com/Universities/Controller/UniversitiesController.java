package com.Universities.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Universities.Exception.NoIdException;
import com.Universities.Model.UniversitiesModel;
import com.Universities.Server.UniversitiesServer;

@RestController
public class UniversitiesController {
	@Autowired
	private UniversitiesServer uniService;
	
	@GetMapping("/University")
	public ResponseEntity<Object> getFindAll()
	{
		try {
			return new ResponseEntity<>(uniService.findAll(),HttpStatus.FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
			
	}
	
	@GetMapping("/University/{Id}")
	public ResponseEntity<Object> getFindOne(@PathVariable int Id) 
	{
		try {

			return new ResponseEntity<>(uniService.findOne(Id),HttpStatus.FOUND);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
		
		

	}
	
	@PostMapping("/University")
	public ResponseEntity<Object> getSaveOneDat(@RequestBody UniversitiesModel uniMod) 
	{
		uniService.SaveOneData(uniMod);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/University/{Id}")
	public ResponseEntity<Object> getUpdateOne(@PathVariable int Id ,@RequestBody  UniversitiesModel uniMod)
	{
		return new ResponseEntity<>(uniService.updateOne(Id, uniMod), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/University/{Id}")
	public ResponseEntity<Object> getDeletOne(@PathVariable int Id) 
	{
		try {
			uniService.deletONe(Id);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}

	
	
}
