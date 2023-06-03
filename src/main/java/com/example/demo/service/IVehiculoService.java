package com.example.demo.service;

import com.example.demo.repo.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void ingresar(Vehiculo v);
	public Vehiculo buscarVehiculo(String placa);
	public void actualizar (Vehiculo v);
	public void eliminar (String placa);

}
