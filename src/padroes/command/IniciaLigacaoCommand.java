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
public class IniciaLigacaoCommand implements Command{
    private Chamadas chamada;

    public IniciaLigacaoCommand(Chamadas chamada){
        this.chamada = chamada;
    }
    
    @Override
    public void executa() {
        chamada.ligacao();
    }
}
