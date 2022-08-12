package com.Universities.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Universities.Model.UniversitiesModel;
import com.Universities.Repository.UniversitiesRepository;

@Service
public class UniversitiesServer {

	@Autowired
	private UniversitiesRepository uniRepo;

	public void SaveOneData(UniversitiesModel uniMod) 
	{
		uniRepo.save(uniMod);
	}
}
