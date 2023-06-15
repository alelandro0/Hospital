package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona {
	private int numeroHistoriaClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergico;
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		listaMedicamentosAlergico= new ArrayList<String>();
		numeroHistoriaClinica= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Historia clinica"));
		sexo=JOptionPane.showInputDialog("ingrese sexo");
		grupoSanguineo=JOptionPane.showInputDialog("Ingrese grupo sanguineo");
		
		String pregunta=JOptionPane.showInputDialog("¿Es alergico algun medicamento? Ingrese SI o NO");
		
		if (pregunta.equalsIgnoreCase("si")) {
			String medicamento="";
			String continuar="";
			do {
				medicamento=JOptionPane.showInputDialog("Ingrese el nombre del medicamento al que eres alergico");
				listaMedicamentosAlergico.add(medicamento);
				continuar=JOptionPane.showInputDialog("ingrese SI si desea continuar");
			} while (continuar.equalsIgnoreCase("si"));
		}
		
	}
	
	public void ImprimirDatosPersona(String datos) {
		super.inmprimirDatosPersona(datos);
		datos="Numero de Historia Clinica: "+numeroHistoriaClinica+"\n";
		datos+="Sexo: "+sexo+"\n";
		datos+="Grupo Sanguineo: "+grupoSanguineo+"\n";
		if (listaMedicamentosAlergico.size()>0) {
			datos+="Lista de Medicamentos a los que eres Alergico\n";
			for (int i = 0; i < listaMedicamentosAlergico.size(); i++) {
				datos+="\t"+listaMedicamentosAlergico.get(i)+"\n";
			}
		} else {
            datos+="Paciente no es alergico a ningun medicamento";
		}
		 System.out.println(datos);
	}
	public int getNumeroHistoriaClinica() {
		return numeroHistoriaClinica;
	}
	public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public ArrayList<String> getListaMedicamentosAlergico() {
		return listaMedicamentosAlergico;
	}
	public void setListaMedicamentosAlergico(ArrayList<String> listaMedicamentosAlergico) {
		this.listaMedicamentosAlergico = listaMedicamentosAlergico;
	}

}
