package edu.ejercicios;

import Hijo.ScrumMaster;
import Padre.Empleado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Empleado em= new Empleado("Rayo", 3500);

        System.out.println(em.toString());

        }


        public static void determinarTipo(Empleado empleado)
        {
            if (empleado instanceof ScrumMaster)
            {
                System.out.println("Esto viene de ScrumMaster");
            }
            else if (empleado instanceof Empleado)
            {
                System.out.println("Esto viene de Empleado");
            }
            else if (empleado instanceof  Object)
            {
                System.out.println("Este es cualquier cosa");
            }



        }










}


