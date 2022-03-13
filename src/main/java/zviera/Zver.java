package zviera;

public abstract class Zver implements Beh{
    protected String meno;
    public Zver(String name){
        this.meno=name;
    }
    public abstract void zvukZvera();
    public void pohlad(){
        System.out.println(this.meno+" bol polhadkan");
        this.zvukZvera();
    }
}
