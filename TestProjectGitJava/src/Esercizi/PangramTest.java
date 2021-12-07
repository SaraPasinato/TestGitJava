package Esercizi;

public class PangramTest {

    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";

        PangramChecker pc = new PangramChecker();
        System.out.println("Test 1 >> Result OK");
        assertEquals(true, pc.check(pangram1));

        String pangram2 = "You shall not pass!";
        System.out.println("Test 2 >> Result OK");
        PangramChecker pc2 = new PangramChecker();
        assertEquals(false, pc2.check(pangram2));
    }

    private static void assertEquals(boolean b, boolean check) {
        if (b == check) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test ERR");
        }
    }

}
