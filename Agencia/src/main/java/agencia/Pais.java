/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 * @author Leticia De Lima
 * @author Eduardo Lima
 * @author Douglas De Lima
 * @author Pedro Vinicius
 * @author Yuri Sousa
 */
public class Pais {
    private String nome;
    private String sigla;
    private String prefixoArea;
    
    private Pais(){};
    
    public Pais(String nome, String sigla, String prefixoArea){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getPrefixoArea() {
        return prefixoArea;
    }

    public void setPrefixoArea(String prefixoArea) {
        this.prefixoArea = prefixoArea;
    }
    
    
}
