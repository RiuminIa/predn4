import kontakty.Abonent;
import kontakty.Kontakt;
import zviera.*;

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
//        for (int i=0;i<15000;i++){
//            System.out.println(""+(i)+" "+(char)i);
//        }
        System.out.println("⟴"+"⌧"+"☐"+"☒"+"❌"+"\uD83D\uDCA7");


        /**
         * prednaska 5
         */
        ArrayList<Zver> zverek=new ArrayList<>();
        zverek.add(new Macka("Myuricio"));
        zverek.add(new Pes("Gavno"));
        for (var zver:zverek){
            try {
                kontrola(zver);
            }
            catch (NotPesException | NotMackaEception e){
                System.out.println(e.getMessage());
                //break;
            } finally {
                System.out.println("Some ERROROROR");
            }
        }

    }
    private static void kontrola(Zver zvera) throws NotPesException, NotMackaEception {
        if(zvera instanceof Pes){
            throw new NotMackaEception( "ne macka");
        }
        else {
            throw new NotPesException( "ne pes");
        }
    }
}
