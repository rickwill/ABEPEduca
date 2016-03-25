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
public class Usuario
{
    //Atributos
    private int id;
    private String nome; 
    private String senha;
    
    //Getters e Setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getSenha()
    {
        return senha;
    }
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    //Construtor
    public Usuario(){}
    
    //Metodos
    public void cadastrarPerfil(){}
    public void editarPerfil(){}
    public void buscarPerfil(){}
    public void excluirPerfil(){}
    public void visualizarPerfil(){}
    private boolean validarPerfil(Usuario usuario)
    {
        return false;
    }
    private boolean validarLogin(Usuario usuario)
    {
        return false;
    }
    public int loggin()
    {
        return 0;
    }
    public void logoff(){}
    
    //Equals e Hashcodes

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
}