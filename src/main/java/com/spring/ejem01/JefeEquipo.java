
package com.spring.ejem01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author PROGRAMIA
 */
public class JefeEquipo  implements Gestor{

    private int equipo;
    
    @Autowired
    @Qualifier("net")
    private Recurso recurso;
    
    @Autowired
    @Qualifier("java")
    private Recurso recurso2;

    public JefeEquipo() {
        equipo= 1;
    }

    public JefeEquipo(int equipo, Recurso recurso) {
        this.equipo = equipo;
        this.recurso = recurso;
    }
    

    public void gestionar() {
        System.out.println("GESTIONO EL EQUIPO " + equipo );
        System.out.println("Iniciar Recursos");
        recurso.trabajar();
        recurso2.trabajar();
    }

}
