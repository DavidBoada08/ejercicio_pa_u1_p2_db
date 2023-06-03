package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IVehiculoRepo;
import com.example.demo.repo.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private IVehiculoRepo iVehiculoRepo;

	@Override
	public void ingresar(Vehiculo v) {
		this.iVehiculoRepo.insertar(v);
		
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		
		return this.iVehiculoRepo.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		this.iVehiculoRepo.actualizar(v);
		
	}

	@Override
	public void eliminar(String placa) {
		this.iVehiculoRepo.eliminar(placa);
		
	}

}
