public class Angestellter extends Arbeitnehmer{
    
    protected double bruttoGehalt;
    protected double abzuege;

    public Angestellter(double brutto, double abzuege, int jahr, int pnr){
        super(jahr, pnr);
        this.bruttoGehalt = brutto;
    }
}