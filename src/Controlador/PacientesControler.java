
package Controlador;

import Modelos.PacientesModel;
import VistasControladores.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PacientesControler implements ActionListener{

    frmPrincipal VistaPrincipal = new frmPrincipal();
    PacientesModel ModeloPacientes = new PacientesModel();
    
    public PacientesControler(frmPrincipal VistaPrincipal, PacientesModel ModeloPacientes){
       
       this.VistaPrincipal = VistaPrincipal;
       this.ModeloPacientes = ModeloPacientes;
        
        //PONER A LA ESCUCHA LOS BOTONES
       this.VistaPrincipal.btnIngresar.addActionListener(this);
       this.VistaPrincipal.btnAtenderPaciente.addActionListener(this);
       
       //LEVANTA VISTA PRINCIPAL
       this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
       this.VistaPrincipal.setVisible(true);
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPrincipal.btnIngresar){
            
            if(this.VistaPrincipal.jtTablaPacientes.getColumnCount()==0)
            {
                this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ColumnasPacientes());
            }
            this.ModeloPacientes.DesenlistarAntiguos();
            
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(), 
                this.VistaPrincipal.txtNombre.getText(), 
                this.VistaPrincipal.txtTelefono.getText(), Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
        if(e.getSource()==this.VistaPrincipal.btnAtenderPaciente)
        {
           this.ModeloPacientes.Desencolar();
           this.ModeloPacientes.DesenlistarAntiguos();
           this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
        
       }
    
    
    
}
