/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraodeprojeto.protection.proxy;

/**
 *
 * @author tiago
 */
public class BancoReal{
    private int quantidadeDeUsuarios;
    private int usuariosConectados;
 
    public BancoReal() {
        quantidadeDeUsuarios = (int) (Math.random() * 100);
        usuariosConectados = (int) (Math.random() * 10);
    }
 
    public String getNumeroDeUsuarios() {
        return new String("Total de usuários: " + quantidadeDeUsuarios);
    }
 
    public String getUsuariosConectados() {
        return new String("Usuários conectados: " + usuariosConectados);
    }
}
