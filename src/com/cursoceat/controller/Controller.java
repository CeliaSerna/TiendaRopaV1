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
		"Camiseta de algodon", 10, "100% algodon, lavar a maquina 30ºC");

ArrayList<Producto> p1= new ArrayList<Producto>();
p1.add(miProducto);

System.out.println(p1.toString());
miProducto.aumentarStock(5);	
System.out.println(p1.toString());

Cliente miCliente1 = new Cliente("María", "Pérez", "Calle Oriente,59", "Tomelloso",  "666555444", "70707070e",Pais.ES);
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
	
	}

}
