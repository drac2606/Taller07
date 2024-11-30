/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class SMS implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
