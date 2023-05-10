package Entidades;

import java.math.BigDecimal;

public abstract class Propriedade {


    private String Endereco;
    private BigDecimal preco;
    private boolean ocupado;
    private Proprietario proprietario;
    private Hospede inquilino;



    public Propriedade(String endereco, BigDecimal preco) {
        Endereco = endereco;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Propriedade{" +
                "Endereco='" + Endereco;
    }
}
