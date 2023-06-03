package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {
	
	private List<Vehiculo> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Vehiculo v) {
		baseDatos.add(v);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		Vehiculo vehiculoEncontrado = new Vehiculo();
		for (Vehiculo vehi: baseDatos) {
			if(placa.equals(vehi.getPlaca())) {
				vehiculoEncontrado = vehi;
			break;
			}
		}

		return vehiculoEncontrado;
	}

	@Override
	public void actualizar(Vehiculo v) {

		this.eliminar(v.getPlaca());
		this.insertar(v);
	}

	@Override
	public void eliminar(String placa) {
		baseDatos.remove(this.buscar(placa));
		
	}

}
