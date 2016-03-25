/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.util.Objects;

/**
 * @author Richard
 */
public class Aluno extends Pessoa
{
    //Atributos
    private String registroAluno;
    private String curso;
    private Turma turma;
    private Usuario usuario;
    private Instituicao instituicao;
    
    //Getters e Setters
    //Construtor
    public Aluno(){}
    //Metodos
    public void criarforum(){}
    public void excluirconta(){}
    public void adicionaranexos(){}
    
    //Equals e Hashcodes

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.registroAluno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.registroAluno, other.registroAluno)) {
            return false;
        }
        return true;
    }
    
}