package com.breno.agenda;

import com.breno.dao.ContatoDao;
import com.breno.modelo.Contato;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start projeto");
        
        ContatoDao contatoDao = new ContatoDao();
        Contato contato = new Contato();
        
        contato.setNome("Seu Nome");
        contato.setCelular("31-985968596");
        contato.setIdade("26");
        
        contatoDao.persist(contato);
        
        System.out.println("Projeto finalizado");
        
    }
    
}
