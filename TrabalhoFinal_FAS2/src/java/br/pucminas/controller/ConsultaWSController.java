/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucminas.controller;

import br.pucminas.entidade.Aluno;
import br.pucminas.service.ConsultaNota;
import br.pucminas.util.ConsultaRetorno;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author ramon.pereira
 */
@ManagedBean(name = "consultaController")
public class ConsultaWSController {
    
    private Aluno aluno = new Aluno(); 
    private ConsultaRetorno retorno = new ConsultaRetorno(); 
    private List<ConsultaRetorno> retornos = new ArrayList<>();
    
        
    public void consultaWS(){
        ConsultaNota notaWS = new ConsultaNota(); 
        retorno = notaWS.consultaNota(getAluno().getCodigo());
        if(retorno == null){
           addError("Erro ao consumir o serviço, tente novamente: ");
        }else{
            retornos.add(retorno);
            retorno = new ConsultaRetorno();
        }
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the retorno
     */
    public ConsultaRetorno getRetorno() {
        return retorno;
    }

    /**
     * @param retorno the retorno to set
     */
    public void setRetorno(ConsultaRetorno retorno) {
        this.retorno = retorno;
    }

    /**
     * @return the retornos
     */
    public List<ConsultaRetorno> getRetornos() {
        return retornos;
    }

    /**
     * @param retornos the retornos to set
     */
    public void setRetornos(List<ConsultaRetorno> retornos) {
        this.retornos = retornos;
    }
    
     public void addError(String error){
        FacesContext.getCurrentInstance().addMessage("Erro encontrado!", 
                new FacesMessage(error));
    }
    
}
