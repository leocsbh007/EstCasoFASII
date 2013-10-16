/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucminas.util;

import br.pucminas.entidade.Disciplina;
import java.util.List;

/**
 *
 * @author ramon.pereira
 */
public class ConsultaRetorno {
    
    private String nomeAluno; 
    private List<Disciplina> disciplinas;  
    private String gravado; 
    private String mensagemErro; 

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the disciplinas
     */
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }  

    /**
     * @return the gravado
     */
    public String getGravado() {
        return gravado;
    }

    /**
     * @param gravado the gravado to set
     */
    public void setGravado(String gravado) {
        this.gravado = gravado;
    }

    /**
     * @return the mensagemErro
     */
    public String getMensagemErro() {
        return mensagemErro;
    }

    /**
     * @param mensagemErro the mensagemErro to set
     */
    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }
}
