/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio05;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class Teste {

    public static void altera(ContaBancaria cb) {
        cb.setTitular("Joaozinho");
    }

    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria("Joao", 1);
        altera(c);
        System.out.println(c);
    }
}
