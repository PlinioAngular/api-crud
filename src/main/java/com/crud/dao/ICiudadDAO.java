package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Ciudad;

public interface ICiudadDAO extends JpaRepository<Ciudad, Integer>{

}
