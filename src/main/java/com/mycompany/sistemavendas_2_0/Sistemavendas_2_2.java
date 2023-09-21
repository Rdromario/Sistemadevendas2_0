/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavendas_2_0;

import com.company.outros.Constantes;
import com.maycompany.visao.VisaoMenu;
import com.mycompany.controle.ControleSistema;

/**
 *
 * @author romario.2919
 */
public class Sistemavendas_2_2 {
    public static void main(String[] args) {
        int opacaoMenu;
        
        while (true){
            opacaoMenu = VisaoMenu.menuPricipal();
            
            if(opacaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
                
            }else if(opacaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());
                
            }else if(opacaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
                
            }
            
         
        }
        
    }
    
}
