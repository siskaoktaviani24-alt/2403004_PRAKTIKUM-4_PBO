package inheritance.hierarchicalInheritance;

public class Hewan {
    public String nama;
    public int usia;

    public Hewan(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public void bernapas(){
        System.out.println(nama + " bernapas dengan paru-paru");
    }

    public void bergerak(){
        System.out.println(nama + " dapat bergerak");
    }
}
