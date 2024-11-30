/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Dario Anchundia Cobo
 */
class PhoneFacade extends Facade {
    public PhoneFacade(String apiKey) {
        super(apiKey);
    }

    public void specificOperation1() {
        System.out.println("Operación específica 1 de PhoneFacade");
    }

    public void specificOperation2() {
        System.out.println("Operación específica 2 de PhoneFacade");
    }
}
