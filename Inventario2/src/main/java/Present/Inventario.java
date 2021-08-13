/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Present;

import Logc.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author serpe
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        Comercial objCom;
        Particular objPart;
        Scanner entrada = new Scanner(System.in);
        String texto = "";
        boolean band = true;
        String seleccion;
        while (band) {
            texto = entrada.nextLine();
            String[] datos = texto.split("&");
            seleccion = datos[0];
            switch (seleccion) {
                case "1":
                    if (datos[1].equalsIgnoreCase("Particular")) {
                        objPart = new Particular(Integer.parseInt(datos[2]), Integer.parseInt(datos[3]), datos[4], datos[5]);
                        lista.add(objPart);
                    }
                    if (datos[1].equalsIgnoreCase("Comercial")) {
                        objCom = new Comercial(Integer.parseInt(datos[2]), Integer.parseInt(datos[3]), datos[4], Integer.parseInt(datos[5]));
                        lista.add(objCom);
                    }
                    break;
                case "2":
                    System.out.println("***Inventario de vehículos***");
                    for (Vehiculo veh : lista) {
                        System.out.println(veh.toString());
                    }
                    break;
                case "3":
                    band = false;
                    break;
                default:
                    band = false;
                    break;
            }

        }
    }
}
