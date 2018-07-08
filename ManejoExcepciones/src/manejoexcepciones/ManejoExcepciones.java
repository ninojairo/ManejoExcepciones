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
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Manejo Strings
        ManejoStrings manejoStrings = new ManejoStrings("abcdcba123");

        //Palindrome String Buffer
        manejoStrings.isPalindromoBuffer();

        //Palindrome String Builder
        manejoStrings.isPalindromoBuilder();

        DivisionPorCero divisionPorCero = new DivisionPorCero(13);
        //divisionPorCero.divisionporcerounchecked();
        divisionPorCero.divisionporcerocheckedinterno();

        try {
            divisionPorCero.divisionporcerocheckedexterno();

        } catch (ArithmeticException e) {
            System.out.println("Excepcion Capturada Externa: Division por cero detectada");
        }
        
        MiRecurso miRecurso = new MiRecurso();
        ManejoRecurso manejoRecurso = new ManejoRecurso(miRecurso);
        

    }

}
