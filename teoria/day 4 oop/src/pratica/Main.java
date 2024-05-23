package pratica;

import pratica.entities.Dipendente;
import pratica.entities.DipendenteFullTime;
import pratica.entities.DipendentePartTime;
import pratica.entities.Dirigente;
import pratica.enums.Dipartimento;

public class Main {
    public static void main(String[] args) {

        DipendentePartTime dipendente1= new DipendentePartTime(5, 30, Dipartimento.PRODUZIONE);
        dipendente1.calculateSalary();

        DipendenteFullTime dipendente2= new DipendenteFullTime(10,2000, Dipartimento.AMMINISTRAZIONE);
        dipendente2.calculateSalary();

        Dirigente dipendente3= new Dirigente(15,2500, Dipartimento.VENDITE);
        dipendente3.calculateSalary();
        
        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].stampaMatricola();
        } for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].stampaMatricola();

        }




    }
}
/*ES1
 * le proprietà devono essere accessibili solo dalla classe Dipendente
 * matricola e stipendio solo getter e non setter, tranne dipartimento che può essere modificata con setter
 *crea 3 dipendenti di classe Dipendente nel main
 *crea un array con questi 3 dipendenti e stampa la matricola
 *
 *ES2
 *aggiungi 3 classi full time part time e dirigente
 *Dipendente diventa astratta e le 3 classi devono estendere Dipendente
 * le 3 classi nuove devono avere un metodo calculateSalary()
 * calculateSalary() per fulltime è fisso
 * calculateSalary() per partime dipende da un attributo ore lavorate * paga oraria
 *ES3
 * aggiungi la classe volontario
 *aggiungi gli attributi nome eta e cv
 *crea un interfaccia con il metodo checkIn() comune a dipendente e volontario
 *il metodo checkin deve fare un print dell'orario quindi int a cui inizia il suo turno di lavoro
 * nel main crea un array con dipendenti e volontari e chiama il metodo checkin per ognuno di essi
 *  */