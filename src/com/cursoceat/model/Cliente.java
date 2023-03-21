package com.cursoceat.model;

public class Cliente {

	public static int idCliente;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String localidad ;
	private String telefono ;
	private String dni ;
	Pais paisCliente ;
    private int idTemp;
	
public Cliente(String nombre, String apellidos, String direccion, String localidad, String telefono, String dni,
			Pais paisCliente) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
		this.dni = dni;
		this.paisCliente = paisCliente;
		this.idTemp= idCliente++;
}

public Cliente() {

}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getLocalidad() {
	return localidad;
}

public void setLocalidad(String localidad) {
	this.localidad = localidad;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public Pais getPaisCliente() {
	return paisCliente;
}

public void setPaisCliente(Pais paisCliente) {
	this.paisCliente = paisCliente;
}


public int getIdTemp() {
	return idTemp;
}

public void setIdTemp(int idTemp) {
	this.idTemp = idTemp;
}

@Override
public String toString() {
	return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", localidad="
			+ localidad + ", telefono=" + telefono + ", dni=" + dni + ", paisCliente=" + paisCliente +", idCliente="+ idCliente +"]";
}
	
	
	
}
