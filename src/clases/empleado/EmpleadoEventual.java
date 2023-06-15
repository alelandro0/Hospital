package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {
	
	private double horariosPorHora;
	private String fechaTerminoContrato;
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		horariosPorHora=Integer.parseInt(JOptionPane.showInputDialog("Ingresa salario mensual"));
		fechaTerminoContrato= JOptionPane.showInputDialog("Ingrese fecha de nacimiento (dd/mm/aaaa)");
	}
	public void imprimirDatosPersona(String datos) {
		super.inmprimirDatosPersona(datos);
		datos="Horario por Hora: "+horariosPorHora+"\n";
		datos+="Fecha de termino del contrato: "+fechaTerminoContrato+"\n";
		System.out.println(datos);
	}
	public double getHorariosPorHora() {
		return horariosPorHora;
	}
	public void setHorariosPorHora(double horariosPorHora) {
		this.horariosPorHora = horariosPorHora;
	}
	public String getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}
	public void setFechaTerminoContrato(String fechaTerminoContrato) {
		this.fechaTerminoContrato = fechaTerminoContrato;
	}
	

}
