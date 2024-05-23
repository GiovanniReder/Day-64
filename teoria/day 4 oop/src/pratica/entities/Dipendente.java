package pratica.entities;

import pratica.enums.Dipartimento;
import pratica.interfaces.checkIn;
//ATTRIBUTI

public abstract class Dipendente implements checkIn {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
    //COSTRUTTORE

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //METODO
    public void stampaMatricola() {
        System.out.println("Ciao sono un dipendente e la mia matricola è: " + this.matricola);
    }


    //COSTRUTTORE
    //METODO
    public abstract void checkIn();

    public abstract double calculateSalary();

}
