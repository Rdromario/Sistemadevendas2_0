/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.company.outros.Constantes;
import com.maycompany.visao.VisaoComputador;
import com.maycompany.visao.VisaoMenu;
import com.maycompany.visao.VisaoaVideoGame;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Produto;
import com.mycompany.modelo.VideoGame;
import java.util.ArrayList;
import javax.management.ObjectInstance;

/**
 *
 * @author romario.2919
 */
public class ControleSistema {
    public static ArrayList<Object> produtos  = new ArrayList<>();
   
    public  static void cadastrar(){
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();
       
        if(opcaoProduto == Constantes.CATEGORIA_VIDEO_GAME){
            produtos.add(VisaoaVideoGame.telaCadastroVidiogame());
            
        }else if (opcaoProduto == Constantes.CATEGORIA_COMPUTADOR){
            produtos.add(VisaoComputador.telaCadastroComputador());
         
        }
        
    }
    
    public static void alterar(int indiceProdutos){
        indiceProdutos = indiceProdutos -1;
        
        Object object = produtos.get(indiceProdutos);
        
        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;
            System.out.println("Alterando o produto: " + videoGame.toString());
            
            videoGame = (VideoGame) VisaoMenu.menuAlteracaoProdutoInformacao(videoGame);
            
            ControleSistema.produtos.set(indiceProdutos, videoGame);
         
        }else if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            System.out.println("Alterando o Produto: " + computador.toString());
            
            computador = (Computador)VisaoMenu.menuAlteracaoProdutoInformacao(computador);
            
            ControleSistema.produtos.set(indiceProdutos, computador);
        }
    }
    
    public static void listar(ArrayList<Object> produtos){
        System.out.println("==========Listagem produtos====================");
        for(int i = 0;  i < produtos.size(); i++){
            Object object = produtos.get(i);
            
            if(object instanceof VideoGame){
                VideoGame videoGame = (VideoGame) object;
                System.out.println(videoGame.toString());
            }else if(object instanceof Computador){
                Computador computador = (Computador) object;
                System.out.println(computador.toString());
                        
            }
            
        }
        System.out.println("===============================================");
    }
}
