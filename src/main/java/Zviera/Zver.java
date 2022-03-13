package Zviera;

public abstract class Zver {
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
