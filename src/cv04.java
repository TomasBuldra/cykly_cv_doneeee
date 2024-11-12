public class cv04 {
    public static void main(String[] args) {
        int cislo = 13;
        long fakt = 1;
        for (int i = 1; i <= cislo; i++) {
                fakt *= i;
        }


            System.out.println("Faktoriál čísla " + cislo + " je: " + fakt);
        }


}
