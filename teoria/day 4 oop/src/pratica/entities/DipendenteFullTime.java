package pratica.entities;

import pratica.enums.Dipartimento;
import pratica.interfaces.checkIn;

public class DipendenteFullTime extends Dipendente implements checkIn {

    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    //METHOD
    @Override
    public double calculateSalary() {
        return this.getStipendio();
    }


    @Override
    public void checkIn() {
        System.out.println("Inizio alle 9 ");
    }
}
