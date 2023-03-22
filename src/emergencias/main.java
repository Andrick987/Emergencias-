
package emergencias;

import Controlador.PacientesControler;
import Modelos.PacientesModel;
import VistasControladores.frmPrincipal;

public class main {

    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        PacientesModel ModeloPacientes = new PacientesModel();
        PacientesControler controlador = new PacientesControler(VistaPrincipal, ModeloPacientes);
    }
    
}
