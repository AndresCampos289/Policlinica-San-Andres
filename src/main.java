
import Controladores.PacienteController;
import Modelos.ListaModel;
import Vistas.frmListas;
import Vistas.frmPrincipal;


public class main {


    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal(null, true);
        frmListas VistaLista = new frmListas(null, true);
        ListaModel ModeloLista = new ListaModel();
        
        PacienteController ControladorLista = new PacienteController(VistaPrincipal,VistaLista, ModeloLista);
      
    }
    
}
