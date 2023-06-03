package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IMatriculaRepo;
import com.example.demo.repo.IPropietarioRepo;
import com.example.demo.repo.IVehiculoRepo;
import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.Propietario;
import com.example.demo.repo.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo iMatriculaRepo;

	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Autowired
	private IVehiculoRepo iVehiculoRepo;

	@Autowired
	@Qualifier("liviano")
	private CalcularMatricula calcularMatricula;

	@Autowired
	@Qualifier("pesado")
	private CalcularMatricula calcularMatricula1;
	

	@Override
	public Matricula matricula(String cedula, String placa) {
		// TODO Auto-generated method stub
				Propietario propie = this.iPropietarioRepo.buscar(cedula);
				Vehiculo vehiculo = this.iVehiculoRepo.buscar(placa);
				Matricula matricula = new Matricula();

				matricula.setFechaMatricula(LocalDateTime.now());
				matricula.setPropietario(propie);
				matricula.setVehiculo(vehiculo);

				if (vehiculo.getTipo().equals("liviano")) {
					BigDecimal valor = this.calcularMatricula.calcularValor(vehiculo.getPrecio());

					if (valor.compareTo(new BigDecimal(2000)) <= 1) {
						matricula.setValorMatricula(valor);
					} else {
						BigDecimal descuento = valor.multiply(new BigDecimal(0.07));
						BigDecimal nuevoValor = valor.subtract(descuento);
						matricula.setValorMatricula(nuevoValor);
					}

				} else {
					BigDecimal valor = this.calcularMatricula1.calcularValor(vehiculo.getPrecio());

					if (valor.compareTo(new BigDecimal(2000)) <= 1) {
						matricula.setValorMatricula(valor);
					} else {
						BigDecimal descuento = valor.multiply(new BigDecimal(0.07));
						BigDecimal nuevoValor = valor.subtract(descuento);
						matricula.setValorMatricula(nuevoValor);
					}
				}
	}

}
