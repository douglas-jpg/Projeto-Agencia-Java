
package br.com.laboratorio.agencia;

public class AgenteDuplo extends Agente {
    private AgenciaInteligencia agenciaInteligenciaVerdadeira;
    private String informacoes;
    private String informacoesTopSecrets;
    
    public AgenteDuplo(AgenciaInteligencia agenciaInfiltrada, AgenciaInteligencia agenciaInteligenciaVerdadeira){}
    
    public Pais getPaisVerdadeiro(){
        return Pais;
    }
    public String getInformacoes(Agente agente){
        return String;
    }
    
    public void receberMensagem(Mensagem mensagem){
        
    }
}
