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
public class Banco extends BancoReal {
    protected String usuario, senha;
    public Banco(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    @Override
    public String getNumeroDeUsuarios() {
        if (temPermissaoDeAcesso()) {
            return super.getNumeroDeUsuarios();
        }
        return "Você não tem permissão parceiro";
    }
    @Override
    public String getUsuariosConectados() {
        if (temPermissaoDeAcesso()) {
            return super.getUsuariosConectados();
        }
        return "Você não tem permissão parceiro";
    }
    private boolean temPermissaoDeAcesso() {
        return usuario == "admin" && senha == "admin";
    }
}
