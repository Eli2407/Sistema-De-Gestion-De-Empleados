
package app;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Proyecto {
    private String nombreProyecto;
    private double presupuesto;
    private String fechaInicio;
    private String fechaFinal;
    private List<Empleado> empleadosAsignados;


    public Proyecto() {
        this.nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto: ");
        this.presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Indique que presupuesto se encuentra disponible para el proyecto"));
        this.fechaInicio = JOptionPane.showInputDialog("Digite la fecha de inicio del proyecto");
        this.fechaFinal = JOptionPane.showInputDialog("Digite la fecha final del proyecto");
        this.empleadosAsignados = new ArrayList<>();
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

  
    public void asignarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado " + empleado.getNombre() + " asignado al proyecto " + nombreProyecto);
    }
      public void mostrarEmpleadosAsignados() {
        StringBuilder sb = new StringBuilder("Empleados asignados al proyecto " + nombreProyecto + ":\n");
        for (Empleado e : empleadosAsignados) {
            sb.append("Nombre: ").append(e.getNombre()).append(", Puesto: ").append(e.getPuesto()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
}
