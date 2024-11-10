import java.time.LocalDate;
import java.util.Objects;

public class AssietteRonde extends Assiette{
    private double rayon;

    public AssietteRonde(int anneef, double rayon) {
        super(anneef);
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return super.toString() + " Rayon: " + rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public void afficher() {
        System.out.println(toString());
    }
    public double surface(){
        return rayon*rayon*3.14;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssietteRonde that = (AssietteRonde) o;
        return Double.compare(rayon, that.rayon) == 0;
    }
    public double valeur(){
        if (LocalDate.now().getYear()-this.getAnneef()>50){
            return (LocalDate.now().getYear()-this.getAnneef()-50);
        }
        else{
            return 0;
        }
    }
}
