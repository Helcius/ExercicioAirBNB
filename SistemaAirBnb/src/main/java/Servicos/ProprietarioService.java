package Servicos;

import Entidades.Propriedade;
import Entidades.Proprietario;

public class ProprietarioService{
    public static boolean addPropriedade(Proprietario proprietario, Propriedade propriedade) {
        proprietario.setListaPropriedades(propriedade);


        return true;
    }
}
