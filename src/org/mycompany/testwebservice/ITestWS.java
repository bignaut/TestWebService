/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mycompany.testwebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author dmaleksa
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ITestWS {
    
    @WebMethod String testMethod(String value1, String value2);
     
}
