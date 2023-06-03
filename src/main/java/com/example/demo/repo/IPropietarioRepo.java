package com.example.demo.repo;

import com.example.demo.repo.modelo.Propietario;

public interface IPropietarioRepo {

	public void insertar(Propietario p);

	public Propietario buscar(String cedula);

	public void actualizar(Propietario p);

	public void eliminar(String cedula);
}
