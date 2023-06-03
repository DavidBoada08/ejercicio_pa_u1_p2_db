package com.example.demo.repo;

import com.example.demo.repo.modelo.Vehiculo;

public interface IVehiculoRepo {

	public void insertar(Vehiculo v);
	public Vehiculo buscar(String placa);
	public void actualizar (Vehiculo v);
	public void eliminar (String placa);
}
