package pratica.entities;

import pratica.enums.Dipartimento;
import pratica.interfaces.checkIn;

public class Dirigente extends Dipendente implements checkIn {
    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return this.getStipendio();
    }

    @Override
    public void checkIn() {
        System.out.println("Inizio e non finisco ");
    }
}
