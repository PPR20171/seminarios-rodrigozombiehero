
package padraodeprojeto.proxy;

public class ProxyImagem implements Imagem{
    
    private TipoRealImagem minhaImagem;
    private final String nomeDoArquivo;
    
    public ProxyImagem(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
    }
    /* método que usa um padrão singleton para controlar o acesso das imagens poderia ser um pool*/
    @Override
    public void exibirImagem(){
        if(minhaImagem == null){
            minhaImagem = new TipoRealImagem(this.nomeDoArquivo);  
        }
        minhaImagem.exibirImagem();
    }
    
}
