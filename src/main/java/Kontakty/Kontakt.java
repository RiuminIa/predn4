package Kontakty;

public class Kontakt {
    protected String meno;
    protected  String preizvisko;

    protected  Kontakt[] znamy;

    public Kontakt(String meno, String preizvisko) {
        this.meno = meno;
        this.preizvisko = preizvisko;
    }
    public Kontakt(String celeMeno) {
        var casti=celeMeno.split(" "); //разделяет стринг на два
        this.meno = casti[0];
        this.preizvisko = casti[1];
    }

    public void pridayZnamyh(Kontakt[] kontakty){
        this.znamy=kontakty;
    }
    @Override
    public String toString() {
        return this.meno+" "+this.preizvisko;
    }
}
