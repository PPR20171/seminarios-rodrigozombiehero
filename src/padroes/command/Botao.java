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
public class Botao {
    Command comando;
    
    public Botao(Command comando){
        this.comando = comando;
    }
    
    public void executaBotao(){
        comando.executa();
    }
}
