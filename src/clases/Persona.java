package clases;

import javax.swing.JOptionPane;

public class Persona {
private String numeroDeDNI;
private String nombre;
private String apellido;
private String fechaDeNacimiento;
private String direccion;
private String ciudadDeProcedencia;

public void inmprimirDatosPersona(String datos) {
	
	datos+="Nombre: "+nombre+"\n";
	datos+="Apellidos: "+apellido+"\n";
	datos+="Fecha de Nacimiento: "+fechaDeNacimiento+"\n";
	datos+="Direccion: "+direccion+"\n";
	datos+="ciudad de procedencia: "+ciudadDeProcedencia+"\n";
	
	System.out.println(datos);
}
public void registrarDatos() {
	numeroDeDNI=JOptionPane.showInputDialog("Ingrese numero de documento");
    nombre=JOptionPane.showInputDialog("ingrese nombre");
    apellido=JOptionPane.showInputDialog("Ingrese apellido");
    fechaDeNacimiento=JOptionPane.showInputDialog("Ingrese fecha de nacimiento");
    direccion=JOptionPane.showInputDialog("Ingrese direccion");
    ciudadDeProcedencia=JOptionPane.showInputDialog("Ingrese ciudad de procedencia");
}
public String getNumeroDeDNI() {
	return numeroDeDNI;
}
public void setNumeroDeDNI(String numeroDeDNI) {
	this.numeroDeDNI = numeroDeDNI;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getFechaDeNacimiento() {
	return fechaDeNacimiento;
}
public void setFechaDeNacimiento(String fechaDeNacimiento) {
	this.fechaDeNacimiento = fechaDeNacimiento;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getCiudadDeProcedencia() {
	return ciudadDeProcedencia;
}
public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
	this.ciudadDeProcedencia = ciudadDeProcedencia;
}

}
