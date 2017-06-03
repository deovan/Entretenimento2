package entretenimento.studio.com.entretenimento;

/**
 * Created by Celio Nascimento on 02/06/2017.
 */

public class aEstabelecimento {


    private String nome;
    private int imagem;
    private String endereco;

    public aEstabelecimento(String nome, String endereco, int imagem){

        this.nome = nome;
        this.endereco = endereco;
        this.imagem = imagem;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}



