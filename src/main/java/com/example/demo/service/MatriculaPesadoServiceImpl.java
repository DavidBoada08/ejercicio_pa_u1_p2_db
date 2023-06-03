package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("pesado")
public class MatriculaPesadoServiceImpl implements CalcularMatricula  {

	@Override
	public BigDecimal calcularValor(BigDecimal valor) {
		BigDecimal valorNuevo= valor.multiply(new BigDecimal(0.15));
		return valorNuevo;
	}

}
