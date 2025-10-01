package inheritance.hierarchicalInheritance;

public class HierarchicalTest {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("si putih", 2, "Persia");
        kucing.bernapas();
        kucing.bergerak();
        kucing.mengeong();

        System.out.println();

        Anjing anjing = new Anjing("dogy", 1, "Hitam");
        anjing.bernapas();
        anjing.bergerak();
        anjing.menggonggong();
    }
}
