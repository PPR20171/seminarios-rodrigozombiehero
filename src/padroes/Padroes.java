/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes;

import padroes.command.*;


/**
 *
 * @author lucas
 */
public class Padroes {

    public static void main(String[] args) {
       /*O construtor de chamada envia a msg "aguardando tipo de chamada" 
        quando construido*/
        Chamadas chamada = new Chamadas();
       
        /*Command que vai determinar qualo tipo de chamada iniciar*/
        Command inicia = new IniciaLigacaoCommand(chamada);
        //inicia = new IniciaVideochamadaCommand(chamada);
        
        Botao botao = new Botao(inicia);
        botao.executaBotao();
    }
    
}
