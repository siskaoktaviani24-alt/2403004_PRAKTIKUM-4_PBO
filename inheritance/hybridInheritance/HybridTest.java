package inheritance.hybridInheritance;

public class HybridTest {
    public static void main(String[] args) {
        Burung elang = new Burung("Elang");
        elang.bernapas();
        elang.bergerak();
        elang.bertelur();

        System.out.println();

        Harimau harimau = new Harimau("Harimau Sumatra", "Hutan Tropis");
        harimau.info();
        harimau.bernapas();
        harimau.bergerak();
        harimau.menyusui();
        harimau.makanDaging();
        harimau.berburu();
    }
}
