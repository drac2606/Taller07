/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class TarjetaCreditoPremium implements TarjetaCredito {
    private double costoAnual = 300.0;
    private double limiteCredito = 15000.0;

    @Override
    public double getCostoAnual() {
        return costoAnual;
    }

    @Override
    public double getLimiteCredito() {
        return limiteCredito;
    }
}
