/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Dario Anchundia Cobo
 */
public abstract class Facade {
    protected String apiKey;

    public Facade(String apiKey) {
        this.apiKey = apiKey;
    }

    public void commonOperation1() {
        System.out.println("Ejecutando operación común 1...");
    }

    public void commonOperation2() {
        System.out.println("Ejecutando operación común 2...");
    }
}