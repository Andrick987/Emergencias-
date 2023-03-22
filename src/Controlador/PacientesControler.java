
package Controlador;

import Modelos.PacientesModel;
import VistasControladores.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PacientesControler implements ActionListener{

    frmPrincipal VistaPrincipal = new frmPrincipal();
    PacientesModel ModeloPacientes = new PacientesModel();
    
    public PacientesControler(frmPrincipal VistaPrincipal, PacientesModel ModeloPacientes){
       
        //PONER A LA ESCUCHA LOS BOTONES
       this.VistaPrincipal.btnIngresar.addActionListener(this);
       this.VistaPrincipal.btnIngresar.addActionListener(this);
       
       //LEVANTA VISTA PRINCIPAL
       this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
       this.VistaPrincipal.setVisible(true);
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPrincipal.btnIngresar){
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(), 
            this.VistaPrincipal.txtNombre.getText(), 
            this.VistaPrincipal.txtTelefono.getText(), Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
       }
    
    
    
}
