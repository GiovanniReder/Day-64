package pratica.entities;

import pratica.enums.Dipartimento;

public class Dirigente extends Dipendente{
    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }
    public void calculateSalary(){
        System.out.println( "Ciao non sono ricco ma guadagno:" + this.getStipendio() );
    }
}
