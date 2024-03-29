package br.com.fornaciari.desafio.icarros.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fornaciari.desafio.icarros.model.ResultGrandPrix;

public interface ResultGrandPrixRepository extends MongoRepository<ResultGrandPrix, Integer>{
	List<ResultGrandPrix> findByYear(Integer year);
}
