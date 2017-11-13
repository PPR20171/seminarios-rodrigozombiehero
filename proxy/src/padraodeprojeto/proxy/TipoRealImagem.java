
package padraodeprojeto.proxy;


public class TipoRealImagem implements Imagem{
    private final String nomeDoArquivo;
    
    /*Construtor que recebe o caminho do arquivo*/
    public TipoRealImagem(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
        carregarArquivo();
    }
    /* método que envia uma mensagem para informar que o arquivo está carregando */
    public void carregarArquivo(){
        System.out.println("Carregendo o arquivo: "+this.nomeDoArquivo+" do disco");
    }
    
    @Override
    public void exibirImagem(){
        System.out.println("Exibindo o arquivo de imagem: "+this.nomeDoArquivo);
    } 
    
    
}
