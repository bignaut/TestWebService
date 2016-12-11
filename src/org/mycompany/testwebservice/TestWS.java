/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mycompany.testwebservice;

import javax.jws.WebService;

@WebService(endpointInterface = "org.mycompany.testwebservice.ITestWS")
public class TestWS implements ITestWS {

    @Override
    public String testMethod(String value1, String value2) {
        System.out.println("the passed word is \""+ value1 + " " + value2 + "\"");
        return "the passed word is \""+ value1 + " " + value2 + "\"";
    }
    
}
