/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf3n212.carro;

import controller.CCarro;
import controller.CPessoa;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 182120013
 */
public class Inf3n212Carro {

    public static CPessoa cadPessoa = new CPessoa();
    public static CCarro cadCarro = new CCarro();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cadPessoa.mockPessoas();
        cadCarro.mockCarros();
        int opM = 99;
        int opSM = 99;
        do {
            System.out.println("Sistema de Cadastro");
            menuP();
            opM = leiaNumInt();
            switch (opM) {
                case 1:
                case 2:
                    do {
                        subMenu(opM);
                        opSM = leiaNumInt();
                        switch (opSM) {
                            case 1:
                                System.out.println("Cadastra");
                                if (opM == 1) {
                                    cadastrarPessoa();
                                } else {
                                    cadastrarCarro();
                                }

                                break;
                            case 2:
                                System.out.println("Edita");
                                if (opM == 2) {
                                    EditaPessoa();
                                } else {
                                    EditaCarro();
                                }
                                break;
                            case 3:
                                System.out.println("Lista");
                                if (opM == 3) {
                                    ListarPessoa();
                                } else {
                                    ListarCarro();
                                }
                                break;
                            case 4:
                                System.out.println("Deleta");
                                if (opM == 4) {
                                    DeletaPessoa();
                                } else {
                                    DeletaCarro();
                                }
                                break;
                            case 0:

                                break;
                            default:
                                System.out.print("Opção invalida, tente novamente");
                        }//fim do switch

                    } while (opSM != 0);//fim do do

                    break;

                case 0:
                    System.out.println("\u001B[41m" + "Aplicação Encerrada Pelo usuário");
                default:
                    System.out.println("\u001B[41m" + "Добро пожаловать в товарищеский Советский Союз!");
            }//fim do shwitch

        } while (opM != 0); //fim do do

    }//fim da main

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("\u001B[36m" + "Добро пожаловать в товарищеский Советский Союз!");
        }
        return 99;
    }//fim do leiaNumInt

    public static void menuP() {
        System.out.println("\u001B[33m" + "_____Menu Inicial____");
        System.out.println("\u001B[33m" + "1-Gerenciar Pessoa");
        System.out.println("\u001B[33m" + "2-Gerenciar Carro");
        System.out.println("\u001B[33m" + "0-Sair");
        System.out.println("\u001B[33m" + "Digite aqui: ");
    }//fim do menu inicial

    public static void subMenu(int opM) {
        String subM = null;
        if (opM == 1) {
            subM = "Pessoa";
        }
        if (opM == 2) {
            subM = "Carro";
        }
        System.out.println("\u001B[32m" + "Gerenciador de " + subM);
        System.out.println("\u001B[32m" + "1-Cadastrar" + subM);
        System.out.println("\u001B[32m" + "2-Editar" + subM);
        System.out.println("\u001B[32m" + "3-Listar" + subM + "s");
        System.out.println("\u001B[32m" + "4-Deletar" + subM);
        System.out.println("\u001B[32m" + "0-Voltar");
        System.out.println("\u001B[32m" + "Digite aqui: ");
    }//fim subMenu

    private static void cadastrarCarro() {
        System.out.println("Carro");
    }

    private static void cadastrarPessoa() {
        System.out.println("Pessoa");

    }

    private static void EditaPessoa() {
        System.out.println("Pessoa");
    }

    private static void EditaCarro() {
        System.out.println("cARRO");
    }

    private static void ListarPessoa() {
        System.out.println("Pessoa");
    }

    private static void ListarCarro() {
        System.out.println("Carro");
    }

    private static void DeletaPessoa() {
        System.out.println("Pessoa");
    }

    private static void DeletaCarro() {
        System.out.println("Macaco");
    }

}//fim da public class
