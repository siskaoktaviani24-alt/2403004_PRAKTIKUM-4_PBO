package inheritance.multilevelInheritance;

public class multilevelTest {
    public static void main(String[] args) {
        Harimau harimau = new Harimau("Harimau Sumatra", 4, "Hutan Sumatra");

        harimau.bernapas();
        harimau.bergerak();

        harimau.menyusui();
        harimau.infoHarimau();

        harimau.berburu();
        harimau.infoHarimau();
    }
}
