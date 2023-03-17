package com.cursoceat.controller;

import java.util.ArrayList;

import com.cursoceat.model.Producto;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Producto miProducto	= new Producto("Camiseta roja", 15.5, "c:\\imagenes\\img1.jpg", 
		"Camiseta de algodon", 10, "100% algodon, lavar a maquina 30ºC");

ArrayList<Producto> p1= new ArrayList<Producto>();
p1.add(miProducto);

System.out.println(p1.toString());
miProducto.aumentarStock(5);	
System.out.println(p1.toString());
	}

}
