package inheritance.multilevelInheritance;

public class Hewan {
    public String nama;
    
    public Hewan(String nama){
        this.nama = nama;
    }

    public void bernapas(){
        System.out.println(nama + " bernapas menggunakan paru-paru");
    }

    public void bergerak(){
        System.out.println(nama + " dapat bergerak");
    }
}