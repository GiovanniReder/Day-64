package pratica.entities;

import pratica.enums.Dipartimento;
import pratica.interfaces.checkIn;

public class Volontario extends Dipendente implements checkIn {
    //ATTRIBUTI
    private String nome;
    private int età;


    public Volontario(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    //COSTRUTTORE


    //METODO
    @Override
    public double calculateSalary() {
        return 0
                ;
    }

    ;

    @Override
    public void checkIn() {
        System.out.println("Inizio quando mi pare ");
    }
}
