/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

import java.io.FileNotFoundException;

/**
 *
 * @author jnino
 */
public class MiRecurso implements AutoCloseable {

    public MiRecurso() {
    }

    
    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void open() throws FileNotFoundException{
        System.out.println("Recurso Abierto");
    }
    
}
