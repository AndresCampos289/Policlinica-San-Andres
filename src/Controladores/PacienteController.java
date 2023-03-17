
package Controladores;

import Modelos.ListaModel;
import Modelos.Pacientes;
import Vistas.frmListas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class PacienteController implements ActionListener{
    
    frmPrincipal VistaPrincipal;
    frmListas VistaListas;
    ListaModel ModeloVista;

    
    public PacienteController(frmPrincipal VistaPrincipal, frmListas VistaListas, ListaModel ModeloVista)
    {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaListas = VistaListas;
        this.ModeloVista = ModeloVista;
        
        this.VistaPrincipal.btnMedicoUno.addActionListener(this);
        this.VistaPrincipal.btnMedicoDos.addActionListener(this);
        this.VistaPrincipal.btnListas.addActionListener(this);
    
        
        this.VistaListas.btnAgregarUno.addActionListener(this);
        this.VistaListas.btnAgregarDos.addActionListener(this);
        
        this.VistaListas.setLocationRelativeTo(null);
        this.VistaListas.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaPrincipal.btnMedicoUno)
        {
            this.ModeloVista.AgregarPaciente(this.VistaPrincipal.txtApellidos.getText(),
                    this.VistaPrincipal.txtNombres.getText());
            
            
            Queue<Pacientes> listaLocal = this.ModeloVista.ListaUno();
            this.VistaListas.txtListaMedicoUno.setText(listaLocal.peek().toString());
            
            String Cadena = " ";
            for(Pacientes MiListaPacientes : listaLocal)
            {
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombres() +"\n";
                this.VistaListas.txtListaMedicoUno.setText(Cadena);
            }
        }
        if(e.getSource() == this.VistaPrincipal.btnMedicoDos)
        {
            this.ModeloVista.AgregarPaciente(this.VistaPrincipal.txtApellidos.getText(),
                    this.VistaPrincipal.txtNombres.getText());
            
            Queue<Pacientes> listaLocal2 = this.ModeloVista.ListaDos();
            this.VistaListas.txtListaMedicoDos.setText(listaLocal2.peek().toString());
            
            String Cadena = " ";
            for(Pacientes MiListaPacientes : listaLocal2)
            {
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombres() +"\n";
                this.VistaListas.txtListaMedicoDos.setText(Cadena);
            }
            
        }     
    }   
}

