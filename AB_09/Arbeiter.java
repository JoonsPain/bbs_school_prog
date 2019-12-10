public class Arbeiter extends Arbeitnehmer{

    protected int stundenLohn;
    protected int arbeitsZeit;

    public Arbeiter(int lohn, int zeit, int jahr, int pnr){
        super(jahr,pnr);
        this.stundenLohn = lohn;
        this.arbeitsZeit = zeit;
    }

    public double errechneLohn(){
        return this.stundenLohn*this.arbeitsZeit;
    }
}