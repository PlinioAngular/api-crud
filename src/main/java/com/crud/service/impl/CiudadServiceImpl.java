package com.crud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.ICiudadDAO;
import com.crud.model.Ciudad;
import com.crud.service.ICiudadService;

@Service
public class CiudadServiceImpl implements ICiudadService{
	
	@Autowired
	private ICiudadDAO dao;

	@Override
	public Ciudad registrar(Ciudad t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Ciudad modificar(Ciudad t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Ciudad listarId(int id) {
		// TODO Auto-generated method stub
		Optional<Ciudad> opt = dao.findById(id);
		return opt.isPresent()?opt.get():new Ciudad();
	}

	@Override
	public List<Ciudad> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
