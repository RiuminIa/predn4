package Kontakty;

public class Kontakt {
    private String meno;
    private String preizvisko;

    public Kontakt(String meno, String preizvisko) {
        this.meno = meno;
        this.preizvisko = preizvisko;
    }
    public Kontakt(String celeMeno) {
        var casti=celeMeno.split(" ");
        this.meno = casti[0];
        this.preizvisko = casti[1];
    }
}
