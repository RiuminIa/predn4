import Kontakty.Abonent;
import Kontakty.Kontakt;
import Zviera.Macka;
import Zviera.Pes;
import Zviera.Zver;

public class Main {
    public static void main(String[] args) {
        Probnik prob= new Probnik();
        prob.a=3;
        prob.b=3;
        var petr=new Kontakt("Petr Prvi");
        var egor=new Kontakt("Egorka", "Zly");
        var prednasa=new Kontakt("Primer Celoveka");
        var kontakt=new Kontakt[]{petr,egor,prednasa};
        prednasa.pridayZnamyh(kontakt);
        Abonent pes=new Abonent("Mgr","pes","Kral");
        Kontakt perdun=new Abonent("soplya","Pedun", "starik");
        System.out.println(pes);
        System.out.println(prednasa);
        System.out.println(perdun);


        Zver maca=new Macka("Zoya");
        Pes mops=new Pes("Perduha");
        maca.zvukZvera();
        maca.pohlad();
        maca.behai();
        mops.plavanie();
    }
}
