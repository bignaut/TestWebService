/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mycompany.testwebservice;

import javax.xml.ws.Endpoint;

/**
 *
 * @author dmaleksa
 */
public class WSPublisher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/test", new TestWS());
    }
    
}
