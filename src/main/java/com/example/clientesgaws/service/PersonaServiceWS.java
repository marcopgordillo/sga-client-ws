
package com.example.clientesgaws.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonaServiceWS", targetNamespace = "http://servicio.sga.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonaServiceWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.example.clientesgaws.service.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarPersonas", targetNamespace = "http://servicio.sga.example.com/", className = "com.example.clientesgaws.service.ListarPersonas")
    @ResponseWrapper(localName = "listarPersonasResponse", targetNamespace = "http://servicio.sga.example.com/", className = "com.example.clientesgaws.service.ListarPersonasResponse")
    @Action(input = "http://servicio.sga.example.com/PersonaServiceWS/listarPersonasRequest", output = "http://servicio.sga.example.com/PersonaServiceWS/listarPersonasResponse")
    public List<Persona> listarPersonas();

}