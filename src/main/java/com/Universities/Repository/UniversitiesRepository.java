package com.Universities.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Universities.Model.UniversitiesModel;

public interface UniversitiesRepository  extends CrudRepository<UniversitiesModel,Integer>{

}
