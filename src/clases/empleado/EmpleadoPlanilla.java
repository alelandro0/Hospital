package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado {

	private double salarioMensual;
	private double porsentajeAdicionalPorHoraExtra;
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario mensual"));
		porsentajeAdicionalPorHoraExtra=Double.parseDouble(JOptionPane.showInputDialog("Ingrese porsentaje adicional por hora extra"));
		
	}
	public void imprimirDatoPersona(String datos) {
		super.imprimirDatoPersona(datos);
		datos="Salario mensual: "+salarioMensual+"\n";
		datos+="porcentaje adicional por hora extra: "+salarioMensual+"\n";
		System.out.println(datos);
	}
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	public double getPorsentajeAdicionalPorHoraExtra() {
		return porsentajeAdicionalPorHoraExtra;
	}
	public void setPorsentajeAdicionalPorHoraExtra(double porsentajeAdicionalPorHoraExtra) {
		this.porsentajeAdicionalPorHoraExtra = porsentajeAdicionalPorHoraExtra;
	}
	
}
