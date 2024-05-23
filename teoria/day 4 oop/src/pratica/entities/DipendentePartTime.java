package pratica.entities;

import pratica.enums.Dipartimento;

public class DipendentePartTime extends Dipendente{

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }
    public void calculateSalary(){
        int oreLavorate = 100;
        double pagaOraria = 10;
        System.out.println( "Ciao non sono ricco ma guadagno:" + oreLavorate * pagaOraria);
    }
}
