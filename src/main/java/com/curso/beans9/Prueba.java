package com.curso.beans9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * CREACION DE UN BEAN EN SPRING CONTEXT
 * USANDO ANOTACION @AUTOWIRED
 * @author PROGRAMIA
 */
public class Prueba {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/curso/beans9/gestion.xml");
       
        GestionProfesoresService servicio = (GestionProfesoresService) context.getBean("gestionProfesores");
        
        List<Profesor> nuevos = new ArrayList<Profesor>();
        nuevos.add(new Profesor(0, "Mario", "fisica", true ));
        nuevos.add(new Profesor(0, "Carlota TodoLoSaber", "fisica", true ));
        
        servicio.crearProfesores(nuevos);
  
        Collection<Profesor> fisica = servicio.getProfesoresPorEspecialidad("fisica");

        
        System.out.println("---- fisica -------");
        for(Profesor p : fisica) {
        	System.out.printf(". %d  - %s con especialidad de %s %n" , 
        			p.getId(), p.getNombre(), p.getEspecialidad());
        }
    }

}
