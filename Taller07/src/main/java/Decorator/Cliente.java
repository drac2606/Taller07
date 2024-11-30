/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class Cliente {
    public static void main(String[] args) {
        // Ejemplo de uso
        Notifier notifier = new SMS();
        notifier = new WhatsAppDecorator(notifier);
        notifier = new TelegramDecorator(notifier);

        notifier.send("Hola, este es un mensaje decorado!");
    }
}
