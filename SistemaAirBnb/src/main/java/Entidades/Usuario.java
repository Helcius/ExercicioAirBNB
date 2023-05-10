package Entidades;

public abstract class Usuario {

    private String CPF;
    private String nome;

    public Usuario(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
