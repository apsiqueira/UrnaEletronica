package com.example.urnaeletronica;

import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Candidato{


    private String nome,endereco,nacionalidade;
    private Date dataNascimento;
    private static ArrayList<Candidato>Candidatos=new ArrayList();

    public Candidato() {

    }

    public Candidato(String nome, String endereco, String nacionalidade, Date dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Candidato> getCandidatos() {
        return Candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        Candidatos = candidatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void cadastrarCandidato(String nome,String endereco,String nacionalidade,Date dataNascimento){
        setNome(nome);
        setEndereco(endereco);
        setNacionalidade(nacionalidade);
        setDataNascimento(dataNascimento);

    }




    public static  void criarCandidato(String nome,String endereco,String nacionalidade,Date dataNascimento){


      Candidato c= new Candidato();
      c.Candidatos.add(new Candidato(nome, endereco, nacionalidade, dataNascimento));
        Log.i(null, "criarCandidato: sucesso");
        for (Candidato d: Candidatos){
            Log.i(null, "Caditado nome: "+d.getNome());

        }


    }









}
