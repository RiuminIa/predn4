import zviera.Macka;
import zviera.Pes;
import zviera.Zver;
import zviera.ZverCompare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Prednaska5LAmbdi {

    public static void nieco(){
        List<String> auta = new ArrayList<>(List.of("Volvo", "Oka", "lada", "Niva"));
        auta.forEach(s -> {
            System.out.print(""+s+" ");
        });
        auta.forEach(System.out::println);
        auta.forEach(s -> {
            if (Objects.equals(s,"Oka")){
                System.out.println("Oka je");
            }
        });
        List<Zver> zveri=new ArrayList<>(List.of(new Pes("fds"),
                                                new Pes("Pez"),
                                                new Macka("Maca"),
                                                new Macka("Miera")));
        //zveri.sort(new ZverCompare());
        System.out.println(zveri);
        zveri.sort((o1, o2)-> -o1.getMeno().compareTo(o2.getMeno()));
        System.out.println(zveri);
        zveri.sort(Comparator.comparing(Zver::getMeno));


    }


}
