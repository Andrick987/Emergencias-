
package Modelos;

import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

public class PacientesModel {
    
    PriorityQueue<Pacientes> ListaPacientes = new PriorityQueue<Pacientes>();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    public void IngresarPaciente(String ape, String nom, String tel, int grav){
        
        Pacientes nuevoPaciente = new Pacientes(ape, nom, tel, grav);
        ListaPacientes.add(nuevoPaciente);
        
    }
    
    public DefaultTableModel ListarPacientes(){
        
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        this.ModeloTabla.addColumn("GRAVEDAD");
        
        for(Pacientes MilistaDePaciente: ListaPacientes){
            
            this.ModeloTabla.addRow(new Object[]{MilistaDePaciente.getApellidos(), MilistaDePaciente.getNombre(),
            MilistaDePaciente.getTelefono(), MilistaDePaciente.getGravedad()});
            }
        return ModeloTabla;
    }
}
