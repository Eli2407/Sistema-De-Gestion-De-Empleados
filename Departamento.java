
package app;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Departamento {
    private String nombreDepartamento;
    private String ubicacion;
    private List<Empleado> empleados;

    public Departamento() {
        this.nombreDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del Departamento");
        this.ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación del departamento");
        this.empleados = new ArrayList<>(); 
    }



    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void agregarEmpleado(Empleado empleado){
        if(empleado!= null){
            empleados.add(empleado);
            JOptionPane.showMessageDialog(null, "El empleado: "+empleado.getNombre()+"fue agregado con exito al departamento");
        }else{
            JOptionPane.showMessageDialog(null,"El empleado no puede ser nulo");
        }
    }
    public void mostrarEmpleados(){
        StringBuilder sb = new StringBuilder("Empleados en el departamento " + nombreDepartamento + ":\n");
        for (Empleado e : empleados) {
            sb.append("Nombre: ").append(e.getNombre()).append(", Puesto: ").append(e.getPuesto()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
}
