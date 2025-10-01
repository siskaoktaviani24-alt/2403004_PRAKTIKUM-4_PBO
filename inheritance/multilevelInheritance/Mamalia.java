package inheritance.multilevelInheritance;

public class Mamalia extends Hewan {
    public int jumlahKaki;

    public Mamalia(String nama, int jumlahKaki){
        super(nama);
        this.jumlahKaki = jumlahKaki;
    }

    public void menyusui(){
        System.out.println(nama + " adalah mamalia yang menyusui anaknya");
    }

    public void infoMamalia(){
        System.out.println(nama + " memiliki" + jumlahKaki + " kaki");
    }
}