
package agencia;

/**
 * @author Leticia De Lima
 * @author Eduardo Lima
 * @author Douglas De Lima
 * @author Pedro Vinicius
 * @author Yuri Sousa
 */
public class AgenciaInteligencia {
    private String nome;
    private String chave;
    private String alfabeto;
    private Pais pais;
    
    
    public AgenciaInteligencia(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public Mensagem decifrarMensagem(Mensagem mensagem, Agente agente){
            return mensagem;
    }
    
    public Mensagem cifrarMensagem(Mensagem mensagem, Agente agenciaInteligencia){
        return mensagem;
    }
}
