package com.example.oportunidadeapi.repository;

import com.example.oportunidadeapi.model.Oportunidade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OportunidadeRepository extends MongoRepository<Oportunidade, String> {
}

