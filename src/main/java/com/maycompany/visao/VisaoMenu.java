/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author romario.2919
 */
public class VisaoMenu {
    public static int menuPricipal (){
        System.out.println("=======Sistema de Vendas 2.0===================");
        System.out.println("1 - Cadastrar produtos");
        System.out.println("2 - Alterar produtos");
        System.out.println("3 - Remover produtos");
        System.out.println("4 - listar produtos");
        System.out.println("===============================================");
        int opcaoMenu = new Scanner(System.in).nextInt();
        
        return opcaoMenu;
    }
    
    public static int menuEscolhaProduto(){
        System.out.println("==============Cadastar Produtos==============");
        System.out.println("Qual a categoria de produto deseja cadastrar?");
        System.out.println("1 - Video Game");
        System.out.println("2 - Computador");
        System.out.println("=============================================");
        int opcaoPrododuto = new Scanner(System.in).nextInt();
        
        return opcaoPrododuto;
    }
    
    public static int menuAlteracaoProduto(){
        System.out.println("==============Alterar produto================");
        System.out.println("Qual produto deseja alterar?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i+ 1 + " | " + ControleSistema.produtos.get(i));
       
        }
        
        System.out.println("=============================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        
        return produtoAlterar;
    }
    
    public static Object menuAlteracaoProdutoInformacao(Object objeto){
        System.out.println("============Alteração de Produtos=============");
        if(objeto instanceof VideoGame){
         
            System.out.println("Novo nome: ");
            ((VideoGame) objeto).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo Preço: ") ;
            ((VideoGame) objeto).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova Plataforma: ");
            ((VideoGame) objeto).setPlataforma(new Scanner(System.in).nextLine());
        }else if(objeto instanceof Computador){
          System.out.println("Novo nome: ");
            ((Computador) objeto).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo Preço: ") ;
            ((Computador) objeto).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova Quantidade Memoria Ram: ");
            ((Computador) objeto).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Novo Processador: ");
            ((Computador) objeto).setProcessador(new Scanner(System.in).nextLine());
            
        }
        System.out.println("===============================================");
        
        return objeto; 
        
    }
    
    public static int menuRemocaoProduto(){
        System.out.println("==============Remover Produto=============");
        System.out.println("Qual produto deseja remover? ");
        
        for(int i =0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
            
        }
        
        System.out.println("============================================");
        int produtoRemover = new Scanner(System.in).nextInt();
       
        return produtoRemover;
    }
}
 