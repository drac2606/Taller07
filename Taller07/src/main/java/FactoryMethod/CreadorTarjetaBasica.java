/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class CreadorTarjetaBasica extends CreadorTarjeta {
    @Override
    public TarjetaCredito crearTarjetaCredito() {
        return new TarjetaCreditoBasica();
    }
}