/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maycompany.visao;

import com.mycompany.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author romario.2919
 */
public class VisaoaVideoGame {
    public static VideoGame telaCadastroVidiogame(){
    VideoGame videogame = new VideoGame();
    
        System.out.println("=======Cadastro de Video Game==================");
        System.out.println("Nome: ");
        videogame.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        videogame.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Plataforma: ");
        videogame.setPlataforma(new Scanner(System.in).nextLine());
        System.out.println("=================================================S");
        return videogame;
    
        
    }

    
    
}
