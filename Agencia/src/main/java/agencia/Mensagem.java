
package agencia;

/**
 * @author Leticia De Lima
 * @author Eduardo Lima
 * @author Douglas De Lima
 * @author Pedro Vinicius
 * @author Yuri Sousa
 */
public class Mensagem {
    private String texto;
    private NivelSeguranca nivelSeguranca;
    
    private Mensagem(){
        
    }
    public Mensagem(String texto, NivelSeguranca nivelSeguranca){
        
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public NivelSeguranca getNivelSeguranca() {
        return nivelSeguranca;
    }

    
}
