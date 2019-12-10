public class Arbeitnehmer {
    protected int eintrittsJahr;
    protected int personalNr;

    public Arbeitnehmer(int jahr, int pnr){
        this.eintrittsJahr = jahr;
        this.personalNr = pnr;
    }

    public void anzeigen(){
        System.out.println("Eintrittsjahr: "+this.eintrittsJahr);
        System.out.println("Personalnummer: "+this.personalNr);
    }
}