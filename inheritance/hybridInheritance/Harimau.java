package inheritance.hybridInheritance;

public class Harimau extends Mamalia implements Karnivora, Predator {
    public String habitat;

    public Harimau(String nama, String habitat){
        super(nama);
        this.habitat = habitat;
    }

    public void makanDaging() {
        System.out.println(nama + " memakan daging sebagai sumber energi");
    }

    public void berburu(){
        System.out.println(nama + " berburu mangsa di " + habitat);
    }

    public void info(){
        System.out.println("Nama: " + nama);
        System.out.println("Habitat: " + habitat);
    }
}
