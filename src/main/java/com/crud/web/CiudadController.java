package com.crud.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Ciudad;
import com.crud.service.ICiudadService;

@RestController()
@RequestMapping("ciudades")
public class CiudadController {
	
	@Autowired
	private ICiudadService service;
	
	@PostMapping
	public Ciudad registrar(@RequestBody Ciudad dto) {
		
		return service.registrar(dto);
	}
	
	@PutMapping
	public Ciudad modificar(@RequestBody Ciudad dto) {
		
		return service.registrar(dto);
	}
	
	@GetMapping
	public List<Ciudad> listarTodo(){
		return service.listar();
	}
	
	@GetMapping(value="/{id}",produces = "application/json")
	public Ciudad listarPorId(@PathVariable("id") Integer id){
		return service.listarId(id);
	}
	
	@DeleteMapping(value="/{id}",produces = "application/json")
	public void eliminarPorId(@PathVariable("id") Integer id){
		service.eliminar(id);
	}

}
