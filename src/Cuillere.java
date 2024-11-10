import java.time.LocalDate;
import java.util.Objects;

public class Cuillere extends Ustensile{
    private double longeur;

    public Cuillere(int anneef, double longeur) {
        super(anneef);
        this.longeur = longeur;
    }
    @Override
    public String toString() {
        return super.toString()+" longeur= " + longeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }
    public void afficher() {
        System.out.println(toString());
    }
    public double valeur(){
        if (LocalDate.now().getYear()-this.getAnneef()>30){
            return (LocalDate.now().getYear()-this.getAnneef())*0.5;
        }
        else{
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuillere cuillere = (Cuillere) o;
        return Double.compare(longeur, cuillere.longeur) == 0;
    }
}
