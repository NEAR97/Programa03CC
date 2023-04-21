/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa03cc;

/**
 *
 * @author braum
 */
public class Programa03CC {

    public static void main(String[] args) {
        //Abstract
//        MensajeAbstracto ma=null;
//        
//        ma=new MensajeSaludo();
//        ma.msg();
//        
//        ma=new MensajeDespedida();
//        ma.msg();
//        
//        ma=new MensajeAbstracto() {
//            @Override
//            public void msg() {
//                System.out.println("otro...");
//            }
//        };
//        ma.msg();
        
        //Modelo interface
        IMensaje m=null;
        m=new MensajeSaludoI();
        m.msg();
        
        m=new MensajeDespedidaI();
        m.msg();
        
        //instancia anonima, asi se crea la dependencia
        m=new IMensaje() {
            @Override
            public void msg() {
                System.out.println("Otro..");
            }
        };
        m.msg();
        
        //System.out.println("Hello World!");
    }
}
