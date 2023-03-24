
import Controladores.PacienteController;
import Vistas.frmPrincipal;
import Modelos.ListaModel;
import Vistas.frmListas;


public class main {


    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal(null, true);
        frmListas VistaLista = new frmListas();
        ListaModel ModeloLista = new ListaModel();
        
        PacienteController ControladorLista = new PacienteController(VistaPrincipal,VistaLista, ModeloLista);
      
    }
    
}
