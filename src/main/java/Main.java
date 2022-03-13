import kontakty.Abonent;
import kontakty.Kontakt;
import zviera.Macka;
import zviera.Pes;
import zviera.Zver;

import java.util.*;

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



       ArrayList<Pes> listPsov=new ArrayList<>();
       listPsov.add(new Pes("Gav"));
        listPsov.add(new Pes("Gaf"));
        ArrayList<Macka> listMacek=new ArrayList<>();
        listMacek.add(new Macka("persik"));
        listMacek.add(new Macka("dimok"));

        ArrayList<Zver> zoopark=new ArrayList<>();
        zoopark.addAll(listPsov);
        zoopark.addAll(listMacek);
        System.out.println(zoopark.size());
        Collections.shuffle(zoopark); //smesenie
        zoopark.get(0).zvukZvera();
        Collections.shuffle(zoopark);

//        for(var i=0;i<zoopark.size();i++){
//            zoopark.get(i).pohlad();
//        }
//        for(Zver zver:zoopark){
//            zver.pohlad();
//        }
        var iterator=zoopark.iterator();
        while (iterator.hasNext()){
            iterator.next().pohlad();
        }

        Pes[] pole=new Pes[2];
        listPsov.toArray(pole);
        for(Zver zver:pole){
            zver.zvukZvera();
        }
        List<Pes> psi = Arrays.asList(pole);
        ArrayList<Pes> list2=new ArrayList<>(psi);
        list2.add(new Pes("Gauc"));
        System.out.println(list2.size());
    }
}
