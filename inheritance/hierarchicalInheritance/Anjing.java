package inheritance.hierarchicalInheritance;

public class Anjing extends Hewan {
    public String warnaBulu;

    public Anjing(String nama, int usia, String warnaBulu){
        super(nama, usia);
        this.warnaBulu = warnaBulu;
    }

    public void menggonggong(){
        System.out.println(nama + " menggonggong: Guk guk!");
    }
}
