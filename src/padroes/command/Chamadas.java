/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes.command;

/**
 *
 * @author lucas
 */
public class Chamadas {
    public Chamadas(){
        System.out.println("Aguardando tipo de chamada");
    }
    
    public void videoChamada(){
        System.out.println("Iniciando video chamada");
    }
    
    public void ligacao(){
        System.out.println("Iniciando chamada de audio");
    }
}
