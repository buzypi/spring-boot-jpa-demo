package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Website;

public interface WebsiteRepository extends CrudRepository<Website, Integer> {

}