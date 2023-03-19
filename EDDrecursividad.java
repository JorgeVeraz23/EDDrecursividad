/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eddrecursividad;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *zx
 * @author USER
 */
public class EDDrecursividad {

    public static void main(String[] args) {
        EDDrecursividad recursividad = new EDDrecursividad();
        recursividad.bajarEscalera(5);
    }
    //Creando un metodo para bajar una escalera de manera recursiva
    public void bajarEscalera(int escalones){
        if(escalones ==  0 ){
            //Case Base, Respuesta Explicita
            System.out.println("Has Terminado de bajar la escalera");
        }else if(escalones < 0){
            System.out.println("No puedes bajar escalones negativos");
        }
        else{
            try {
                //Dominio es decir la division del problema original en problema -1
                Thread.sleep(500);
                System.out.println("Bajando escalon "+ escalones);
                //Haciendo uso de la recursividad
                bajarEscalera(escalones - 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(EDDrecursividad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
