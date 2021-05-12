/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_clases;

import java.util.Scanner;

/**
 *
 * @author ÁNGEL_HIDALGO
 */
public class Actividad_Clases {

    static void encabezados() {
        System.out.println("UNIVERSIDAD AUTÓNOMA DE CAMPECHE");
        System.out.println("FACULTAD DE INGENIERÍA");
        System.out.println("INGENIERÍA EN SISTEMAS COMPUTACIONALES");

    }

    static void separador() {
        System.out.println("[-----------------------------------------------]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        encabezados();
        separador();
        Scanner leer = new Scanner(System.in);
        
        
        personas actividades = new personas();
        actividades.setTipo("Alumno:");
        actividades.setNombre("Ángel");
        actividades.setEdad(19);
        actividades.setSexo('H');
        actividades.setCurp("MAHA020416HCCNDNA0");
        actividades.setActividad("Trabajo de laboratorio");
        System.out.println(actividades.toString());
        int num1 = leer.nextInt();
        switch (num1) {
            case 1:
                actividades.entrada();
                break;
            case 2:
                actividades.actividad();
                break;
            case 3:
                actividades.reseso();
                break;
            case 4:
                actividades.salida();
                break;
        } 
        
        edificios actividades2 = new edificios();

        actividades2.setCampus('V');
        actividades2.setÁrea("Dirección");
        actividades2.setEnergiaEl(false);
        actividades2.setEstado("Ocupado");
        actividades2.setCapacidad(30);
        System.out.println(actividades2.toString());
        int num2 = leer.nextInt();
        switch (num2) {
            case 1:
                actividades2.estadoDeUso();
                break;
            case 2:
                actividades2.condiciones();
                break;
            case 3:
                actividades2.capacidad();
                break;
        }

    }

}
