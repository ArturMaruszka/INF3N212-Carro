/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carro;

import controller.CCarro;
import controller.CPessoa;

/**
 *
 * @author 182120013
 */
public class Inf3n212Carro {
    public static CPessoa cadPessoa = new CPessoa();
    public static CCarro cadCarro = new CCarro();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cadPessoa.mockPessoas();
        cadCarro.mockCarros();
        
        System.out.println(cadPessoa.getPessoas());
        System.out.println("---");
        System.out.println(cadCarro.getCarros());
        
    }//fim da main
    
}//fim da public class
