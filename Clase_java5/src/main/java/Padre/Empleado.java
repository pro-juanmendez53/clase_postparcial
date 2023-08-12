package Padre;

public class Empleado {

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    private String nombre;
    private Double sueldo;

    public String direccion;

    public String getNombre(){
     return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("homero"))
        {
            this.nombre="No homeros";
        }
        else
        {
         this.nombre=nombre;
        }
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado (String nombre, double sueldo)
    {

    }


    public String obtenerdetalles()
    {
        return "nombre: " + this.getNombre()+ "Sueldo:" +this.getSueldo();
    }
//    @Override
//    public String toString ()
//    {
//        return "su nombre es:" + this.getNombre() + "Tu sueldo es: " + this.getSueldo();
//    }
//


}
