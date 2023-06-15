package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class ModeloDatos {
	HashMap<String, Paciente> pacienteMap;
	HashMap<String, EmpleadoPlanilla> empleadoPlanillaMap;
	HashMap<String, EmpleadoEventual> empleadoEventualMap;
	HashMap<String, Medico> medicoMap;
	ArrayList<CitasMedicas> citasList;

	public ModeloDatos() {
		pacienteMap = new HashMap<String, Paciente>();
		empleadoPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
		empleadoEventualMap = new HashMap<String, EmpleadoEventual>();
		medicoMap = new HashMap<String, Medico>();
		citasList= new ArrayList<CitasMedicas>();
	}

	public void registrarPersona(Paciente miPaciente) {
		pacienteMap.put(miPaciente.getNumeroDeDNI(), miPaciente);
		System.out.println("Se ha registrado " + miPaciente.getNombre() + " satisfactoriamente");
	}

	public void registrarPersona(EmpleadoPlanilla miEmpleadoPlanilla) {
		empleadoPlanillaMap.put(miEmpleadoPlanilla.getNombre(), miEmpleadoPlanilla);
		System.out.println(
				"Se ha registrado el empleado por planilla " + miEmpleadoPlanilla.getNombre() + " satisfactoriamente");
	}

	public void registrarPersona(EmpleadoEventual miEmpledoEventual) {
		empleadoEventualMap.put(miEmpledoEventual.getNumeroDeDNI(), miEmpledoEventual);
		System.out.println(
				"Se ha registrado el empleado enventual " + miEmpledoEventual.getNombre() + " satisfactoriamente");
	}

	public void registrarPersona(Medico miMedico) {
		medicoMap.put(miMedico.getNumeroDeDNI(), miMedico);
		System.out.println("Se ha registrado el medico " + miMedico.getNombre() + " satisfactoriamente");
	}

	public void imprimirPaciente() {
		// TODO Auto-generated method stub
		String msj = "PACIENTE REGISTRADO\n";
		Iterator<String> iterator = pacienteMap.keySet().iterator();
		while (iterator.hasNext()) {
			String clave = iterator.next();
			pacienteMap.get(clave).inmprimirDatosPersona(msj);
		}
	}

	public void imprimirEmpleadosEventuales() {
		// TODO Auto-generated method stub
		String msj = "EMPLEADOS EVENTUALES REGISTRADOS\n";
		for (String clave : empleadoEventualMap.keySet()) {
			empleadoEventualMap.get(clave).inmprimirDatosPersona(msj);
		}
	}

	public void imprimirEmpleadosPorPlanilla() {
		// TODO Auto-generated method stub
		String msj = "EMPLEADOS POR PLANILLA REGISTRADOS\n";
		for (EmpleadoPlanilla empledoPlanilla : empleadoPlanillaMap.values()) {
			empledoPlanilla.inmprimirDatosPersona(msj);
		}
	}

	public void imprimirMedicos() {
		// TODO Auto-generated method stub
		String msj = "MEDICO REGISTRADOS\n";
		for (Map.Entry<String, Medico> entry : medicoMap.entrySet()) {

			entry.getValue().inmprimirDatosPersona(msj);
		}
	}

	public Paciente consultarPacientePorDocumento(String documentoPaciente) {
		Paciente miPaciente = null;
		if (pacienteMap.containsKey(documentoPaciente)) {
			miPaciente = pacienteMap.get(documentoPaciente);
		}
		return miPaciente;
	}

	public Medico consultarMedicoPorDocumento(String nombreMedico) {
		for (Medico medico : medicoMap.values()) {
			if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
				return medico;
			}
		}
		return null;
	}
	public void registarCitasMedicas(CitasMedicas miCita) {
		citasList.add(miCita);
		System.out.println("se ha registrado la cita exitosamente");
		System.out.println(miCita.informacionCitaMedica());
	}
	public void imprimirCitasProgramadas() {
		String msj="CITAS PROGRAMADAS\n";
		CitasMedicas miCita=null;
		System.out.println(msj+"\n");
		
		if (citasList.size()>0) {
			for (int i = 0; i < citasList.size(); i++) {
				miCita=citasList.get(i);
				System.out.println(miCita.informacionCitaMedica());
			}
		} else {
               System.out.println("no existen citas programadas");
		}
	}
}
