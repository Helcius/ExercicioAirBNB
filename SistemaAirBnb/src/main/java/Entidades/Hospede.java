package Entidades;

public class Hospede extends Usuario{
    private boolean disponibilidade;
    private Propriedade propriedadeAtual;

    public Hospede(String CPF, String nome) {
        super(CPF, nome);
    }
}
