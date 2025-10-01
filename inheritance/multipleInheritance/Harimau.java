public class Harimau implements Mamalia, Karnivora {
    public String nama;
    public int usia;

    public Harimau(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public void menyusui(){
        System.out.println(nama + " berusia " + usia + " sedang menyusui anaknya");
    }

    public void bernapas(){
        System.out.println(nama + " berusia " + usia + " bernapas dengan paru-paru");
    }

    public void berburu(){
        System.out.println(nama + " berusia " + usia + " sedang berburu mangsa");
    }

    public void makanDaging(){
        System.out.println(nama + " berusia " + usia + " memakan " + jenisMakanan + ".");
    }
}