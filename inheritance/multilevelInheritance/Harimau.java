package inheritance.multilevelInheritance;

public class Harimau extends Mamalia{
    public String habitat;

    public Harimau(String nama, int jumlahKaki, String habitat){
        super(nama, jumlahKaki);
        this.habitat = habitat;
    }

    public void berburu(){
        System.out.println(nama + " sedang barburu di " + habitat);
    }

    public void infoHarimau(){
        System.out.println(nama + " hidup di " + habitat);
    }
}
