package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.repo.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo {
	
	private List<Propietario> baseDatos = new ArrayList();
	

	@Override
	public void insertar(Propietario p) {
		baseDatos.add(p);
		
	}

	@Override
	public Propietario buscar(String cedula) {
		Propietario propiEncontrado = new Propietario();
		for(Propietario propi : baseDatos) {
			if (cedula.equals(propi.getIdentificacion())) {
				propiEncontrado = propi;
			}
		}
		return propiEncontrado;
	}

	@Override
	public void actualizar(Propietario p) {
		this.eliminar(p.getIdentificacion());
		this.insertar(p);
		
	}

	@Override
	public void eliminar(String cedula) {
		baseDatos.remove(this.buscar(cedula));
		
	}
	
	

}
