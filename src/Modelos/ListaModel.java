
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class ListaModel {
    
    Queue<Pacientes> ListaPacientes1 = new LinkedList();
    Queue<Pacientes> ListaPacientes2 = new LinkedList();
    
    public void AgregarPaciente(String ape, String nom)
    {
        Pacientes nuevoPaciente = new Pacientes(ape, nom);
        this.ListaPacientes1.add(nuevoPaciente);
        this.ListaPacientes2.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO");
        
    }
    
    public Queue ListaUno()
    {
        return this.ListaPacientes1;
        
    }
    
    public Queue ListaDos()
    {
        return this.ListaPacientes2;
        
    }
    
    public void EliminarPaciente() 
    {
        this.ListaPacientes1.poll();
        this.ListaPacientes2.poll();
    }
    
}
