package Entidades;

import java.util.LinkedList;

public class Proprietario extends Usuario{

    private LinkedList<Propriedade> listaPropriedades;

    public Proprietario(String CPF, String nome) {
        super(CPF, nome);
        this.listaPropriedades = new LinkedList<>();
    }

    public void setListaPropriedades(Propriedade propriedade) {
        this.listaPropriedades.add(propriedade);
    }


    public String toString() {
        return "Proprietario{" +
                "nome=" + this.getNome() +
                ", CPF=" + this.getCPF() +
                ", listaPropriedades=" + this.listaPropriedades +
                '}';
    }
}


