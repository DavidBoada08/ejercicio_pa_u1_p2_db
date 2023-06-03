package com.example.demo.service;

import com.example.demo.repo.modelo.Propietario;

public interface IPropietarioService {
	

	public void ingresar(Propietario p);

	public Propietario buscarPropietario(String cedula);

	public void actualizar(Propietario p);

	public void eliminar(String cedula);

}
