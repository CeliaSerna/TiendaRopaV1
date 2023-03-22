package com.cursoceat.controller;

import java.util.ArrayList;

import com.cursoceat.model.Cliente;
import com.cursoceat.model.Pais;
import com.cursoceat.model.Pedido;
import com.cursoceat.model.Producto;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Producto miProducto	= new Producto("Camiseta roja", 15.5, "c:\\imagenes\\img1.jpg", 
		"Camiseta de algod�n", 10, "100% algod�n, lavar a m�quina 30�C");

ArrayList<Producto> p1= new ArrayList<Producto>();
p1.add(miProducto);

System.out.println(p1.toString());
miProducto.aumentarStock(5);	
System.out.println(p1.toString());

Cliente miCliente1 = new Cliente("Mar�a", "P�rez", "Calle Oriente,59", "Tomelloso",  "666555444", "70707070e",Pais.ES);
System.out.println(miCliente1.toString());
	

Pedido miPedido1 = new Pedido();
//System.out.println(miPedido1.toString());

	
miPedido1.setIdCliente(miCliente1.getIdTemp());
miPedido1.setIvaPaisCliente(miCliente1.getPaisCliente().getPorcentaje());
	
miPedido1.setIdProducto(miProducto.getIdProductoTem());

miPedido1.setCantidadProducto(4);

miPedido1.setPrecioProducto(miProducto.getPrecio());
miPedido1.setTotalPedidoSinIva(miPedido1.getPrecioProducto(), miPedido1.getCantidadProducto());

miPedido1.setTotalPedido(miPedido1.gettotalSinIva(), miPedido1.getIvaPaisCliente());
System.out.println(miPedido1.toString());	
	
Cliente miCliente2 = new Cliente("Jose", "Lopez", "Calle La habana","Lisboa", "777744111", "88888888c", Pais.PT);
Cliente miCliente3 = new Cliente("Joan", "Pierre", "Calle Paris", "Lyon", "766444213", "695874478c", Pais.FR);	

Pedido miPedido2 = new Pedido();
miPedido2.setIdProducto(miProducto.getIdProductoTem());
miPedido2.setIdCliente(miCliente2.getIdTemp());
miPedido2.setIvaPaisCliente(miCliente2.getPaisCliente().getPorcentaje());

miPedido2.setCantidadProducto(6);
miPedido2.setPrecioProducto(miProducto.getPrecio());
miPedido2.setTotalPedidoSinIva(miPedido2.getPrecioProducto(), miPedido2.getCantidadProducto());

miPedido2.setTotalPedido(miPedido2.gettotalSinIva(), miPedido2.getIvaPaisCliente());

System.out.println( miPedido2.toString());
	}

}
