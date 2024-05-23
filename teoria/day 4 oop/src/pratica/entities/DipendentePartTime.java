package pratica.entities;

import pratica.enums.Dipartimento;
import pratica.interfaces.checkIn;

public class DipendentePartTime extends Dipendente implements checkIn {

    private int oreLavorate;

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {

        double pagaOraria = 10;
        return oreLavorate * pagaOraria;

    }

    @Override
    public void checkIn() {
        System.out.println("Inizio alle 11 ");
    }
}
