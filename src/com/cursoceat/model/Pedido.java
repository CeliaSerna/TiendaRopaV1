package com.cursoceat.model;

import java.time.LocalDateTime;

public class Pedido implements CalcularIva {

private static int idPedido;
private int idLocal;
private LocalDateTime fechaHoraPedido;
private int idCliente;
private int ivaPaisCliente;
private int idProducto;
private int cantidadProducto;
private double precioProducto;
private double totalPedido;
private double totalSinIva;
	
public Pedido() {
	this.fechaHoraPedido=LocalDateTime.now();
	this.idLocal= ++idPedido;
	//cuando esta delante suma y despues asigna
	//cuando esta detras asigna y despues suma
	
}






public int getIdProducto() {
	return idProducto;
}






public double getPrecioProducto() {
	return precioProducto;
}






public double getTotalPedido() {
	return totalPedido;
}






public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}





//this es para el atributo, sin this es una variable,esta variable se puede llamar de cualquier manera
public void setPrecioProducto(double precioProductoX) {
	if (this.cantidadProducto >=5) {
		this.precioProducto = precioProductoX*0.98;		
				}else {
		
	this.precioProducto = precioProductoX;
}
}





public void setTotalPedido(double totalSinIva, int porcentaje) {
	this.totalPedido = totalSinIva+(totalSinIva*porcentaje/100);
}






public int getIdCliente() {
	
	return idCliente;
}






public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}






public int getIvaPaisCliente() {
	return ivaPaisCliente;
}






public void setIvaPaisCliente(int ivaPaisCliente) {
	this.ivaPaisCliente = ivaPaisCliente;
}






public double gettotalSinIva() {
	return totalSinIva;
}






public int getCantidadProducto() {
	return cantidadProducto;
}






public void setCantidadProducto(int cantidadProducto) {
	this.cantidadProducto = cantidadProducto;
}






public void setTotalPedidoSinIva(double precio, int cantidadProducto) {
	this.totalSinIva = precio*cantidadProducto;
}



@Override
public String toString() {
	return "Pedido [idLocal=" + idLocal + ", fechaHoraPedido=" + fechaHoraPedido + ", idCliente=" + idCliente
			+ ", ivaPaisCliente=" + ivaPaisCliente + ", idProducto=" + idProducto + ", cantidadProducto="
			+ cantidadProducto + ", precioProducto=" + precioProducto + "E, totalPedido=" + totalPedido
			+ "E, totalPedidoSinIva=" + totalSinIva + "E]";
}






@Override
public double calculo(double importe, int porcentaje) {
	
	return 0;
	}

	
	
	
	
}
