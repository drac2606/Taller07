/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Dario Anchundia Cobo
 */
class WebFacade extends Facade {
    public WebFacade(String apiKey) {
        super(apiKey);
    }

    public void specificOperation1() {
        System.out.println("Operación específica 1 de WebFacade");
    }

    public void specificOperation2() {
        System.out.println("Operación específica 2 de WebFacade");
    }

    public void specificOperation3() {
        System.out.println("Operación específica 3 de WebFacade");
    }
}
