/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucminas.entidade;

/**
 *
 * @author ramon.pereira
 */
public class Disciplina {
    
    private String nomeDisciplina; 
    private String codigo; 
    private Double nota; 

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nota
     */
    public Double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
    
    
}
