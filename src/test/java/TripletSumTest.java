import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripletSumTest {

    @Test
    public void testTriplet(){

        int[]arr={45,65,12,45,78,90};
        assertEquals(233,TripletSum.findTripletSum(arr));
    }

    @Test
    public void testTripletForTwo(){
        int[]arr={1,3};
        assertEquals(4,TripletSum.findTripletSum(arr));
    }

    @Test
    public void testTripletForOne(){
        int arr[]={1};
        assertEquals(1,TripletSum.findTripletSum(arr));
    }

    @Test
    public void testTripletForNull(){
        assertThrows(RuntimeException.class,()->TripletSum.findTripletSum(null));
    }

    @Test
    public void testTripletForEmpty(){
        int[] arr={};
        assertThrows(RuntimeException.class,()->TripletSum.findTripletSum(arr));
    }

}