package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IPropietarioRepo;
import com.example.demo.repo.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Override
	public void ingresar(Propietario p) {
		this.iPropietarioRepo.insertar(p);
		
	}

	@Override
	public Propietario buscarPropietario(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscar(cedula);
	}

	@Override
	public void actualizar(Propietario p) {
		this.iPropietarioRepo.actualizar(p);
		
	}

	@Override
	public void eliminar(String cedula) {
		this.iPropietarioRepo.eliminar(cedula);
		
	}

}
