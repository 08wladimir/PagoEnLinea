/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pago;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Wladimir
 */
@WebService(serviceName = "PagoEnLinea")
@Stateless()
public class PagoEnLinea {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param descripcion
     * @param refVenta
     * @param moneda
     * @param valor
     * @param prueba
     * @param usuarioId
     * @param nombre
     * @param identificacion
     * @param email
     * @param tarjeta
     * @param numeroCuenta
     * @return 
     * descripcion
     * refVenta
     * moneda
     * valor
     * prueba
     * usuarioId
     * nombre
     * identificacion
     * email
     * tarjeta
     * numeroCuenta
     * valor 
     * 
     * 
     */
    @WebMethod(operationName = "enviar")
    public String enviar(@WebParam(name = "descripcion") String descripcion, @WebParam(name = "refVenta") String refVenta, @WebParam(name = "moneda") String moneda, @WebParam(name = "valor") String valor, @WebParam(name = "prueba") String prueba, @WebParam(name = "usuarioId") String usuarioId, @WebParam(name = "nombre") String nombre, @WebParam(name = "identificacion") String identificacion, @WebParam(name = "email") String email, @WebParam(name = "tarjeta") String tarjeta, @WebParam(name = "numeroCuenta") String numeroCuenta) {
        //TODO write your implementation code here:
        return "Su Pago Ha Sido Exitoso";
    }
}
