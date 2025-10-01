public class Hewan{

    public String nama;
    public int usia;

    public Hewan(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public void makan(){
        System.out.println(nama + " sedang makan.");
    }

    public void tidur(){
        System.out.println(nama + " sedang tidur.");
    }
}