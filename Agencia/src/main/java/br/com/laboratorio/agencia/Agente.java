/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.laboratorio.agencia;

/**
 * @author Leticia De Lima
 * @author Eduardo Lima
 * @author Douglas De Lima
 * @author Pedro Vinicius
 * @author Yuri Sousa
 */
public class Agente {
    private String pseudonimo;
    private Pais pais;
    private AgenciaInteligencia agenteInteligencia;
    private String informacoes;
    private NivelHierarquico nivelHierarquico;
    
    private Agente(){}
    
    public Agente(AgenciaInteligencia agenteInteligencia){}

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public Pais getPais() {
        return pais;
    }

    private void setPais(Pais pais) {
        this.pais = pais;
    }

    public AgenciaInteligencia getAgenteInteligencia() {
        return agenteInteligencia;
    }

    public void setAgenteInteligencia(AgenciaInteligencia agenteInteligencia) {
        this.agenteInteligencia = agenteInteligencia;
    }

    public String getInformacoes(Agente agente) {
        return informacoes;
    }

    public NivelHierarquico getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(NivelHierarquico nivelHierarquico, AgenciaInteligencia agenciaInteligencia) {
        this.nivelHierarquico = nivelHierarquico;
    }
    
    public Mensagem receberMensagem(Mensagem mensagem){
        return mensagem;
    } 
}
