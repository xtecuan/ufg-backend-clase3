/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.convertidor.temperatura.webservice;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author xtecuan
 */
@WebService(serviceName = "ConvertidorTemperatura")
public class ConvertidorTemperatura {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "fromFarenheit2Celcius")
    public Double fromFarenheit2Celcius(@WebParam(name = "temperaturaFarenheit") Double temperaturaFarenheit) {
        return (temperaturaFarenheit - 32) * (5.00 / 9.00);
    }
}
