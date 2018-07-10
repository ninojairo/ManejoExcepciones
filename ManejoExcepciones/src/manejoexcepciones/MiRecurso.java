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
        System.out.println("Recurso cerrado");
       
    }
    
    public void open() throws FileNotFoundException{
        System.out.println("Recurso Abierto");
    }
    
}
