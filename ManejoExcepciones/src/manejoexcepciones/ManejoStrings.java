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
public class ManejoStrings {

    private String palabra;

    public ManejoStrings(String palabra) {
        this.palabra = palabra;
    }

    public void isPalindromoBuffer() {

        if (this.palabra.equals(new StringBuffer(palabra).reverse().toString())) {
            System.out.println("La palabra " + palabra + " es palindrome");
        } else {
            System.out.println("La palabra " + palabra + " no es palindrome");
        }

    }

    public void isPalindromoBuilder() {
        if (this.palabra.equals(new StringBuilder(palabra).reverse().toString())) {
            System.out.println("La palabra " + palabra + " es palindrome");
        } else {
            System.out.println("La palabra " + palabra + " no es palindrome");
        }
    }

}
