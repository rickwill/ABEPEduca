/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

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
	 
}