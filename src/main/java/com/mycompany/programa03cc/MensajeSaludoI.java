/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa03cc;

/**
 *
 * @author braum
 */
public class MensajeSaludoI implements IMensaje{
    
    @Override
    public void msg() {
        System.out.println("Hola mundo interface....");
    }
}
