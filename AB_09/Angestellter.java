public class Angestellter extends Arbeitnehmer{
    
    protected double bruttoGehalt;
    protected double abzuege;

    public Angestellter(double brutto, double abzuege, int jahr, int pnr){
        super(jahr, pnr);
        this.bruttoGehalt = brutto;
    }

    public double ermittleNetto(){
        return this.bruttoGehalt - this.abzuege;
    }

    public void ausgeben(){
        System.out.println("Bruttogehalt: "+this.bruttoGehalt);
        System.out.println("Abzüge: "+this.abzuege);
        System.out.println("Nettogehalt: "+this.ermittleNetto());
        super.anzeigen();
    }
}