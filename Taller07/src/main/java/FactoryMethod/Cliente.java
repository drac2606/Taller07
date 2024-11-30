/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class Cliente {
    public static void main(String[] args) {
        CreadorTarjeta creador;

        creador = new CreadorTarjetaBasica();
        TarjetaCredito tarjetaBasica = creador.crearTarjetaCredito();
        System.out.println("Tarjeta Básica: Costo Anual = " + tarjetaBasica.getCostoAnual() +
                           ", Límite Crédito = " + tarjetaBasica.getLimiteCredito());

        creador = new CreadorTarjetaPremium();
        TarjetaCredito tarjetaPremium = creador.crearTarjetaCredito();
        System.out.println("Tarjeta Premium: Costo Anual = " + tarjetaPremium.getCostoAnual() +
                           ", Límite Crédito = " + tarjetaPremium.getLimiteCredito());

        creador = new CreadorTarjetaVIP();
        TarjetaCredito tarjetaVIP = creador.crearTarjetaCredito();
        System.out.println("Tarjeta VIP: Costo Anual = " + tarjetaVIP.getCostoAnual() +
                           ", Límite Crédito = " + tarjetaVIP.getLimiteCredito());
    }
}
