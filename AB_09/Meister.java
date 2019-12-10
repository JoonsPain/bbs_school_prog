public class Meister extends Arbeiter{

    protected int abschlussNote;
    protected String pruefungsDatum;
    protected int mitarbeiterAnzahl;

    public Meister(int note, String datum, int untertanen,int lohn, int zeit, int jahr, int pnr){
        super(lohn, zeit, jahr, pnr);
        this.abschlussNote = note;
        this.pruefungsDatum = datum;
        this.mitarbeiterAnzahl = untertanen;
    }
}