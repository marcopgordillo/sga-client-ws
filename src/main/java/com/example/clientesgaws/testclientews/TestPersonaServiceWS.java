/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.clientesgaws.testclientews;

import com.example.clientesgaws.service.Persona;
import com.example.clientesgaws.service.PersonaServiceImplService;
import com.example.clientesgaws.service.PersonaServiceWS;
import java.util.List;

/**
 *
 * @author usuario
 */
public class TestPersonaServiceWS {
    public static void main(String[] args) {
        PersonaServiceWS personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        System.out.println("Ejecutando Servicio Listar Personas WS");
        List<Persona> personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getNombre() + " " + persona.getApePaterno());
        }
        System.out.println("Fin Servicio Listar Personas WS");
    }

}
