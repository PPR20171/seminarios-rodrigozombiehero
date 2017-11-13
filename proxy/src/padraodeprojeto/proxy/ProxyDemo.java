
package padraodeprojeto.proxy;


public class ProxyDemo {
    /* Classe de demostração de uso*/
    public static void main(String[] args){
        Imagem minhaImagem = new ProxyImagem("imagem.mp3");
        minhaImagem.exibirImagem();
    }
    
}
