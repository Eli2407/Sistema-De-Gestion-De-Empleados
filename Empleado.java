
package app;

import javax.swing.JOptionPane;

public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    public String puesto;
    public Proyecto proyecto;

    public Empleado() {
        this.nombre = JOptionPane.showInputDialog("Digite el nombre del Empleado: ");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del Empleado: "));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
        this.puesto = JOptionPane.showInputDialog("Ingrese el puesto del Empleado: ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
      public Proyecto getProyecto() {
        return proyecto;
    }
    
     public void asignarProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
        JOptionPane.showMessageDialog(null, "Empleado " + nombre + " asignado al proyecto " + proyecto.getNombreProyecto() + ".");
    }
}
