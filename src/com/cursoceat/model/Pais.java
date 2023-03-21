package com.cursoceat.model;

public enum Pais {

	ES(21), FR(20), PT(23);

int porcentaje;

private Pais(int porcentaje) {
	this.porcentaje = porcentaje;
}

public int getPorcentaje() {
	return porcentaje;
}




}
