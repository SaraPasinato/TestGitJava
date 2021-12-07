package Esercizi;

public class TenTest {
  public static void main(String[] args) {
    
    assertEquals("Should return true", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'w'}));
    assertEquals("Should return false", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
  }
    
    

    private static void assertEquals(String string, boolean b, boolean valid) {
      if (b == valid ) System.out.println("Test OK");
      
      System.out.println("Test ERR");
    }


}
