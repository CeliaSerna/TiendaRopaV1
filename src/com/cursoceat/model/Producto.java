package com.cursoceat.model;

public class Producto {

	public static int idProducto;
	private String nombre;
	private double precio;
	private String imagenURL;
	private String descripcionC;
	private int stockPro;	
	private String descripcionL;
	private int idProductoTem;


public Producto(String nombre, double precio, String imagenURL, String descripcionC, int stockPro,
		String descripcionL) {
	
	this.nombre = nombre;
	this.precio = precio;
	this.imagenURL = imagenURL;
	this.descripcionC = descripcionC;
	this.stockPro = stockPro;
	this.descripcionL = descripcionL;
	this.idProductoTem = idProductoTem;
	this.idProductoTem = ++idProducto;
}

public Producto() {
    this.idProductoTem= ++idProducto;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getImagenURL() {
	return imagenURL;
}

public void setImagenURL(String imagenURL) {
	this.imagenURL = imagenURL;
}

public String getDescripcionC() {
	return descripcionC;
}

public void setDescripcionC(String descripcionC) {
	this.descripcionC = descripcionC;
}

public int getStockPro() {
	return stockPro;
}

public void setStockPro(int stockPro) {
	this.stockPro = stockPro;
}

public String getDescripcionL() {
	return descripcionL;
}

public void setDescripcionL(String descripcionL) {
	this.descripcionL = descripcionL;
}

public int getIdProductoTem() {
	return idProductoTem;
}

public void restarStock(int cantidad) {
	this.stockPro -= cantidad;
}
public void aumentarStock(int cantidad) {
	this.stockPro += cantidad;
}

@Override
public String toString() {
	return "Producto [nombre=" + nombre + ", precio=" + precio + ", imagenURL=" + imagenURL + ", descripcionC="
			+ descripcionC + ", stockPro=" + stockPro + ", descripcionL=" + descripcionL + ", idProductoTem="
			+ idProductoTem + "]";
}
	
	
}
