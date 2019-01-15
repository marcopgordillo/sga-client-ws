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
        
        System.out.println("\nEjecutando Servicio Encontrar Persona WS");
        Persona personaAEncontrar = new Persona();
        personaAEncontrar.setIdPersona(2);
        Persona personaEncontrada = personaService.encontrarPersonaPorId(personaAEncontrar);
        System.out.println("Persona encontrada: " + personaEncontrada.getIdPersona() + " " + personaEncontrada.getNombre() + " " + personaEncontrada.getApePaterno());
        System.out.println("Fin Servicio Encontrar Persona WS");

        System.out.println("\nEjecutando Servicio Modificar Persona WS");
        personaEncontrada.setApeMaterno("Esparza");
        personaService.modificarPersona(personaEncontrada);
        System.out.println("Persona modificada: " + personaEncontrada.getIdPersona() + " " + personaEncontrada.getNombre() + " " + personaEncontrada.getApePaterno());
        System.out.println("Fin Servicio Modificar Persona Persona WS");

        System.out.println("\nEjecutando Servicio Listar Personas WS");
        personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getIdPersona() + " " + persona.getNombre() + " " + persona.getApePaterno() + " " + persona.getApeMaterno());
        }
        System.out.println("Fin Servicio Listar Personas WS");
        
        System.out.println("\nEjecutando Servicio Eliminar Persona WS");
        personaService.eliminarPersona(personaEncontrada);
        System.out.println("Persona eliminada: " + personaEncontrada.getIdPersona() + " " + personaEncontrada.getNombre() + " " + personaEncontrada.getApePaterno());
        System.out.println("Fin Servicio Eliminar Persona Persona WS");
        

        System.out.println("\nEjecutando Servicio Listar Personas WS");
        personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getIdPersona() + " " + persona.getNombre() + " " + persona.getApePaterno() + " " + persona.getApeMaterno());
        }
        System.out.println("Fin Servicio Listar Personas WS");
    }

}
