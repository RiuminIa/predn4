package zviera;

public class Macka extends Zver {
    public Macka(String name){
       super(name);
    }
    @Override
    public void zvukZvera(){
        System.out.println("Mau Mau Mau");
    }

    @Override
    public void behai() {
        System.out.println("behu");
    }
}
