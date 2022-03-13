package kontakty;

public class Abonent extends Kontakt{
    protected String titul;
    public Abonent (String titul,String meno, String preizvisko){
        super(meno,preizvisko);//pre konstructor Kontakt, na zacatku musi bit
        this.titul=titul;
    }
    @Override
    public String toString() {
        return this.titul+" "+super.toString();
    }

}
