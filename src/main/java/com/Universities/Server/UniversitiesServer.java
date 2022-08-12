package com.Universities.Server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

	public List<UniversitiesModel> findAll()
	{
		List<UniversitiesModel> userData = new ArrayList<>();
		uniRepo.findAll().forEach(userData::add);
		return userData;
	}
	
	public UniversitiesModel findOne(int Id)
	{
		return uniRepo.findById(Id).get();
	}
	
	public void SaveOneData(UniversitiesModel uniMod) 
	{
		uniRepo.save(uniMod);
	}
	
	public List<UniversitiesModel> updateOne(int Id , UniversitiesModel uniMod)
	{
//		uniRepo.deleteById(Id);
//		uniRepo.save(uniMod);
//		return findAll();
		
		if(uniRepo.findById(Id).isPresent())
		{
			UniversitiesModel checking = uniRepo.findById(Id).get();
			checking.setUniaddress( uniMod.getUniaddress() );
			checking.setUniname( uniMod.getUniname() );
			checking.setUnipasspercentage( uniMod.getUnipasspercentage() );
			
			uniRepo.save(checking);
		}
		return findAll();
	}
	
	public void deletONe(int Id) 
	{
		uniRepo.deleteById(Id);
	}
}
