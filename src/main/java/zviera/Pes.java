package zviera;

public class Pes extends Zver implements Plavanie{
    public Pes(String name){
        super(name);
    }
    @Override
    public void zvukZvera(){
        System.out.println("gaf gaf gaf");
    }

    @Override
    public void behai() {
        System.out.println("behu");
    }

    @Override
    public void plavanie() {
        System.out.println("plivu");
    }
}
