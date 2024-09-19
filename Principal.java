
package app;

public class Principal {
    public static void main(String[]args){
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        Empleado emp3 = new Empleado();

        Departamento depto = new Departamento();
        depto.agregarEmpleado(emp1);
        depto.agregarEmpleado(emp2);
        depto.agregarEmpleado(emp3);
        depto.mostrarEmpleados();

        Proyecto proyecto = new Proyecto();
        emp1.asignarProyecto(proyecto);
        emp2.asignarProyecto(proyecto);
        emp3.asignarProyecto(proyecto);
        proyecto.mostrarEmpleadosAsignados();
        
    }
}
