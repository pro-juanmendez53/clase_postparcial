package Hijo;

import Padre.Empleado;

public class ScrumMaster extends Empleado {

    private String departamento;
    public String getDepartamento ()
    {
        return departamento;
    }
    public void setDepartametno(String departametno) {
        this.departamento = departamento;}

    public ScrumMaster(String nombre, Double sueldo, String dpto) {
        super(nombre, sueldo);
        this.departamento=departamento;
    }

    @Override
    public String obtenerDetalles()
    {
        return "nombre: " + this.getNombre()+ "Sueldo:" +this.getSueldo() + "Departamento:" + this.getDepartamento();
    }


    }



