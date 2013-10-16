/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucminas.controller;

import br.pucminas.entidade.Aluno;
import br.pucminas.entidade.Endereco;
import br.pucminas.service.AlunoService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author ramon.pereira
 */
@ManagedBean (name="alunoBean")
@RequestScoped
@SessionScoped
public class AlunoController {
    
    private Aluno alunoBean = new Aluno();
    private Endereco endereco = new Endereco();
    private List<Aluno> alunos = new ArrayList<>();
    
        
    public void obterEndereco(){  
      AlunoService service = new AlunoService(alunoBean.getCep()); 
      endereco = service.obterLogradouro();
      if(endereco == null){
          addError("Erro ao consultar o serviço web services de Correio");
      }else{
          alunoBean.setBairro(endereco.getBairro());
          alunoBean.setCidade(endereco.getCidade());
          alunoBean.setLogradouro(endereco.getEndereco());
          alunoBean.setUf(endereco.getUF());
      }
      
     // System.out.println(end);      
    }
    
    public void adiciona(){
        this.alunos.add(this.alunoBean);
        this.alunoBean = new Aluno();
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return alunoBean;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.alunoBean = aluno;
    }

    /**
     * @return the alunos
     */
    public List<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void addError(String error){
        FacesContext.getCurrentInstance().addMessage("Erro encontrado!", 
                new FacesMessage(error));
    }
    
    
}
