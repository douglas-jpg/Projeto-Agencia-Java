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
public enum NivelHierarquico {
    JUNIOR(1, "Junior"),
    PLENO(2, "Pleno"),
    SENIOR(3, "Senior"),
    COMANDO(4, "Comando");
    
    int codigo;
    String nivelHierarquico;
    
    NivelHierarquico(int codigo, String nivelHierarquico){
        this.codigo = codigo;
        this.nivelHierarquico = nivelHierarquico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(String nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }
    
    
}
