package App;

import Servicos.*;
import Entidades.*;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Proprietario Helcius = new Proprietario("123.456.789", "Helcius");

        Apartamento apt = new Apartamento("Av. 123", BigDecimal.valueOf(1500.00));
        Casa casa = new Casa("Av. 456", BigDecimal.valueOf(4500.00));
        ProprietarioService.addPropriedade(Helcius, apt);
        ProprietarioService.addPropriedade(Helcius, casa);


        System.out.println(Helcius);
    }

}