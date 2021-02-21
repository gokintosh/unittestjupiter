import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {

    private static StringPalindrome stringPalindrome;

    @BeforeAll
    private static void doInitialization(){
        stringPalindrome=new StringPalindrome();
    }

    @Test
    public void isPalindromeTest1(){
        assertEquals(true,stringPalindrome.isPalindrome("malayalam"));
    }

    @Test
    public void isPalindromeTest2(){
        assertEquals(false,stringPalindrome.isPalindrome("gokul"));
    }

}