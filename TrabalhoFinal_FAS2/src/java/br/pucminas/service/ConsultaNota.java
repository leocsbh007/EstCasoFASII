/*
 * Esta classe tem como objetivo
 */
package br.pucminas.service;

import br.pucminas.entidade.Aluno;
import br.pucminas.entidade.Disciplina;
import br.pucminas.entidade.Nota;
import br.pucminas.util.ConsultaRetorno;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author ramon.pereira
 */
@WebService
public class ConsultaNota {
    
    private List<Aluno> alunos;
    private ConsultaRetorno retorno; 
    
    @WebMethod(operationName = "consultaNota")
    public ConsultaRetorno consultaNota(String idAluno){
        
        alunos = iniciaDados();         
        retorno = retornaDadosWS(idAluno);
        return retorno;       
    }
    
    private ConsultaRetorno retornaDadosWS(String idAluno){
        ConsultaRetorno ret = new ConsultaRetorno();
        String encontrado; 
        for(int i=0; i< alunos.size(); i++){
            if(alunos.get(i).getCodigo().equals(idAluno)){
                ret.setDisciplinas(alunos.get(i).getDisciplinas());
                ret.setGravado("S");
                ret.setMensagemErro("");
                ret.setNomeAluno(alunos.get(i).getNome());
            }
        }
        if(ret.getNomeAluno() == null){
            ret.setMensagemErro("Aluno não encontrado. Codigo: "+idAluno);
            ret.setGravado("N");
            return ret;
        }else{
            return ret;
        }
        
        
    }
    
    private List<Aluno> iniciaDados(){
        
        List<Aluno> alunosLocal = new ArrayList<>();
        
        List<Disciplina> dis1 = new ArrayList<>();
        List<Disciplina> dis2 = new ArrayList<>();
        List<Disciplina> dis3 = new ArrayList<>();
        List<Disciplina> dis4 = new ArrayList<>();
        
        Disciplina disciplina = new Disciplina();  
        disciplina.setCodigo("01");
        disciplina.setNomeDisciplina("Matematica");
        disciplina.setNota(8.0);
        
        Disciplina di1 = new Disciplina();  
        di1.setCodigo("01");
        di1.setNomeDisciplina("Matematica");
        di1.setNota(1.0);
        
        Disciplina di2 = new Disciplina();  
        di2.setCodigo("01");
        di2.setNomeDisciplina("Matematica");
        di2.setNota(3.0);
        
        Disciplina di3 = new Disciplina();  
        di3.setCodigo("02");
        di3.setNomeDisciplina("Portugues");
        di3.setNota(5.0);
        
        Disciplina di4 = new Disciplina();  
        di4.setCodigo("02");
        di4.setNomeDisciplina("Portugues");
        di4.setNota(8.0);
        
        Disciplina di5 = new Disciplina();  
        di5.setCodigo("0");
        di5.setNomeDisciplina("Portugues");
        di5.setNota(9.0);
        
        dis1.add(di1);
        dis1.add(di3);
        
        dis2.add(di1);
        dis2.add(di3); 
        
        dis3.add(di4);
        dis3.add(disciplina);
        
        dis4.add(disciplina);
        dis4.add(di5);
        
        
        Aluno a = new Aluno(); 
        a.setNome("Ze Firmindo");
        a.setCodigo("01");
        a.setDisciplinas(dis1);
        
        Aluno a2 = new Aluno(); 
        a2.setNome("Jose de Freitas");
        a2.setCodigo("02");
        a2.setDisciplinas(dis2);
        
        Aluno a3 = new Aluno(); 
        a3.setNome("Jose de Souza");
        a3.setCodigo("03");
        a3.setDisciplinas(dis3);
        
        Aluno a4 = new Aluno(); 
        a4.setNome("Jose de Freitas");
        a4.setCodigo("04");
        a4.setDisciplinas(dis4);
        
        alunosLocal.add(a);
        alunosLocal.add(a2);
        alunosLocal.add(a3);
        alunosLocal.add(a4);
        
        return alunosLocal;         
    }
    
}
