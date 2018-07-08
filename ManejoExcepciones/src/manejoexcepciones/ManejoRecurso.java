/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

/**
 *
 * @author jnino
 */
public class ManejoRecurso {

    MiRecurso miRecurso;

    public ManejoRecurso(MiRecurso miRecurso) {
        this.miRecurso = miRecurso;
    }

    public void abrirRecurso() {
        try {miRecurso.open();}
        catch (Exception e) {
            System.out.println("Excepcion capturada");
        } finally {

            try {
                miRecurso.close();

            } catch (Exception e) {
                System.out.println("Excepcion capturada");
            }

        }
    }

    public void cerrarRecurso() {
        try {
            miRecurso.open();

        } catch (Exception e) {
            System.out.println("Excepcion capturada");
        } finally {

            try {
                miRecurso.close();

            } catch (Exception e) {
                System.out.println("Excepcion capturada");
            }

        }
    }

}
