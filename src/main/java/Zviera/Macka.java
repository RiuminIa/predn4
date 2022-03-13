package Zviera;

public class Macka extends Zver {
    public Macka(String name){
        this.meno=name;
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
