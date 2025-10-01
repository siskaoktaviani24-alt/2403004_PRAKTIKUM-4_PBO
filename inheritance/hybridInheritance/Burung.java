package inheritance.hybridInheritance;

public class Burung extends Hewan {
    public Burung(String nama){
        super(nama);
    }

    public void bertelur(){
        System.out.println(nama + " berkembang biak dengan cara bertelur");
    }
}
