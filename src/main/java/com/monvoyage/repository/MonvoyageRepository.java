package com.monvoyage.repository;

import org.springframework.data.repository.CrudRepository;

import com.monvoyage.models.MonModel;

public interface MonvoyageRepository extends CrudRepository<MonModel, String>{

}
