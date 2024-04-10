/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package agencia;

/**
 * @author Leticia De Lima
 * @author Eduardo Lima
 * @author Douglas De Lima
 * @author Pedro Vinicius
 * @author Yuri Sousa
 */
public enum NivelSeguranca {
    BAIXO(1, "Baixo"),
    MEDIO(2, "Medio"),
    ALTO(3, "Alto"),
    TOPSECRET(4, "TopSecret");
    
    int codigo;
    String nivelSeguranca;
    
    NivelSeguranca(int codigo, String nivelSeguranca){
        this.codigo = codigo;
        this.nivelSeguranca = nivelSeguranca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNivelSeguranca() {
        return nivelSeguranca;
    }

    public void setNivelSeguranca(String nivelSeguranca) {
        this.nivelSeguranca = nivelSeguranca;
    }
    
    
}
