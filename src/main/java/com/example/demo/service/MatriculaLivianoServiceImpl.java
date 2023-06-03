package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("liviando")
public class MatriculaLivianoServiceImpl implements CalcularMatricula {

	@Override
	public BigDecimal calcularValor(BigDecimal valor) {
		BigDecimal valorNuevo= valor.multiply(new BigDecimal(0.10));
		return valorNuevo;
	}

}
