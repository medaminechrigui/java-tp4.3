import java.time.LocalDate;
import java.util.Objects;

public class AssietteCarree extends Assiette{
    private double cote;
    public AssietteCarree(int anneef, double cote) {
        super(anneef);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return super.toString()+" cote= " + cote;
    }
    public void afficher() {
        System.out.println(toString());
    }

    @Override
    public double surface() {
        return cote*cote;
    }
    public double valeur(){
        AssietteRonde r=new AssietteRonde(this.getAnneef(), 0);
        if (LocalDate.now().getYear()-this.getAnneef()>50){
            return r.valeur()*2;
        }
        else{
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssietteCarree that = (AssietteCarree) o;
        return Double.compare(cote, that.cote) == 0;
    }
}


