import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmStrongNumberTest {


    @Test
    public void isArmStrongTest1(){
        int number=153;
        Assertions.assertEquals(true,ArmStrongNumber.isArmStrong(number));
    }


    @Test
    public void isArmStrongTestForNegative(){
        int number=-153;
        Assertions.assertThrows(RuntimeException.class,()->ArmStrongNumber.isArmStrong(number));
    }
}