package pratica.entities;

import pratica.enums.Dipartimento;

public class DipendenteFullTime extends Dipendente{

    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }
    //METHOD
    public void calculateSalary(){
        System.out.println( "Ciao non sono ricco ma guadagno:" + this.getStipendio() );
    }

    @Override
    public astract Salary() {
        for ()
        return super.Salary();
    }
}
