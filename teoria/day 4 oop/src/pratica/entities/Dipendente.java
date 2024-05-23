package pratica.entities;

import pratica.enums.Dipartimento;
//ATTRIBUTI

public abstract class Dipendente {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    //COSTRUTTORE

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //METODO
    public void stampaMatricola(){
        System.out.println( "Ciao sono un dipendente e la mia matricola è: " + this.matricola );
    }
    public astract Salary();

    //COSTRUTTORE
    //METODO
public abstract void checkIn();
}
