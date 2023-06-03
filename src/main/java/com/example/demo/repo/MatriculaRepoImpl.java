package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.Propietario;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {
	
	private List<Matricula> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Matricula matricula) {
		baseDatos.add(matricula);
		
	}
	
	

}
