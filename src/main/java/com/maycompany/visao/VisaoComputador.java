/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycompany.visao;

import com.mycompany.modelo.Computador;
import java.util.Scanner;

/**
 *
 * @author romario.2919
 */
public class VisaoComputador {
   public static Computador telaCadastroComputador(){
       Computador computador = new Computador();
       
       System.out.println("============Cadastro de Computador==========");
       
       System.out.println("Nome: ");
       computador.setNome(new Scanner(System.in).nextLine());
       System.out.println("Preço: ");
       computador.setPreco(new Scanner(System.in).nextDouble());
       System.out.println("Memoria Ram: ");
       computador.setMemoriaRam(new Scanner(System.in).nextDouble());
       System.out.println("Processador: ");
       computador.setProcessador(new Scanner(System.in).nextLine());
       System.out.println("===============================================");
       
       return computador; 
   }
}
