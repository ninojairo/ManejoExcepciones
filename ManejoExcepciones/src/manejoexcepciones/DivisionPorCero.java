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
public class DivisionPorCero {

    private final int DENOMINADOR = 0;
    private int numerador;
    private int cociente;

    public DivisionPorCero(int numerador) {
        this.numerador = numerador;

    }

    public void divisionPorCeroUnchecked() {
        cociente = this.numerador / this.DENOMINADOR;
    }

    public void divisionPorCeroCheckedInterno() {
        try {
            cociente = this.numerador / this.DENOMINADOR;
            throw new ArithmeticException();

        } catch (ArithmeticException e) {
            System.out.println("Excepcion Capturada Interna: Division por cero detectada");
            //e.printStackTrace();
        }

    }
    
    public void divisionPorCeroCheckedExterno() throws ArithmeticException{
        cociente = this.numerador / this.DENOMINADOR;
    }
    

}
