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
public class App {
    public static void main(String[] args) {
        System.out.println("Hacker acessando");
        BancoReal banco = new Banco("Hacker", "1234");
        System.out.println(banco.getNumeroDeUsuarios());
        System.out.println(banco.getUsuariosConectados());

        System.out.println("\nAdministrador acessando");
        banco = new Banco("admin", "admin");
        System.out.println(banco.getNumeroDeUsuarios());
        System.out.println(banco.getUsuariosConectados());
    }
}
