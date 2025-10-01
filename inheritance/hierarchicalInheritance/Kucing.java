package inheritance.hierarchicalInheritance;

public class Kucing extends Hewan{
    public String ras;

    public Kucing(String nama, int usia, String ras){
        super(nama, usia);
        this.ras = ras;
    }

    public void mengeong(){
        System.out.println(nama + " mengeong: Meonggggg!");
    }
}
