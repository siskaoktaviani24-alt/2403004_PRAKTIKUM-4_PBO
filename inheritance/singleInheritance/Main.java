public class Main{
    public static void main(String[] args) {
        Kelinci kelinci1 = new Kelinci("si putih", 4);
        kelinci1.mencariMakan();
        kelinci1.makan();

        Kelinci kelinci2 = new Kelinci("si hitam", 1);
        kelinci2.tidur();
    }
}