package com.cursoceat.model;

public enum Pais {

	ES(1.21), FR(1.20), PT(1.23);

double porcentaje;

private Pais(double porcentaje) {
	this.porcentaje = porcentaje;
}

public Double getPorcentaje() {
	return porcentaje;
}




}
