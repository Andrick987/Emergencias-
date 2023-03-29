
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
    
    public DefaultTableModel DesenlistarAntiguos()
    {
        this.ModeloTabla.setRowCount(0);
        return ModeloTabla;
    }
    public DefaultTableModel ListarPacientes()
    {
       
        
        for(Pacientes MiListaDePacientes: ListaPacientes)
        {
            this.ModeloTabla.addRow(new Object []{MiListaDePacientes.getApellidos(),
            MiListaDePacientes.getNombre(),MiListaDePacientes.getTelefono(),MiListaDePacientes.getGravedad()});
        }
        
        return ModeloTabla;
    }
     public DefaultTableModel ColumnasPacientes(){
         this.ModeloTabla.addColumn("APELLIDOS");
            this.ModeloTabla.addColumn("NOMBRE");
            this.ModeloTabla.addColumn("TELEFONO");
            this.ModeloTabla.addColumn("GRAVEDAD");
            
            return ModeloTabla;
     }
     public void Desencolar(){
        
        this.ListaPacientes.poll();
        
    }
}
