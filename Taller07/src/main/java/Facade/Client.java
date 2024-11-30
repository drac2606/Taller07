/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class Client {
    public static void main(String[] args) {
        Facade webFacade = new WebFacade("API_KEY_WEB");
        webFacade.commonOperation1();
        ((WebFacade) webFacade).specificOperation1();

        Facade mobileFacade = new MobileFacade("API_KEY_MOBILE");
        mobileFacade.commonOperation2();
        ((MobileFacade) mobileFacade).specificOperation3();

        Facade phoneFacade = new PhoneFacade("API_KEY_PHONE");
        phoneFacade.commonOperation1();
        ((PhoneFacade) phoneFacade).specificOperation2();
    }
}