public class cv02 {
    public static void main(String[] args) {
        int[] pole = {0, 2, 7, 8, 0, 9,};
        int pocetNul = 0;

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] == 0) {
                pocetNul++;
            }
        }
        System.out.println("Počet nul v poli: " + pocetNul);

    }
}
