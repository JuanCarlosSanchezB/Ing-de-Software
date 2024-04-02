import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestElMasGrande {
   @Test
    public void testElMasGrande() {
        int[] array = {1, 2, 3, 5, 4};
        int result = ElMasGrande.elMasGrande(array);
        assertEquals(5, result);
    } 
    @Test
    public void test2ElMasGrande() {
        int[] array = {1, 2, 3, 4, 5};
        int result = ElMasGrande.elMasGrande(array);
        assertEquals(5, result);
    }
    @Test
    public void test3ElMasGrande() {
        int[] array = {8, 2, 3, 4, 5};
        int result = ElMasGrande.elMasGrande(array);
        assertEquals(8, result);
    }
    @Test
    public void testLargestWithNull() {
        int[] array = null;
        try {
            ElMasGrande.elMasGrande(array);
        } catch (IllegalArgumentException e) {
            assertEquals("Array is null", e.getMessage());
        }
    }
    
    @Test
    public void test1() { 

    // Enter code here 

    assertEquals(10,ElMasGrande.elMasGrande(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); 

    } 

    @Test 

    public void test2() { 

    // Enter code here 

    assertEquals(80,ElMasGrande.elMasGrande(new int[]{-4, 20, 6, 80, 0, 45, 79, 2})); 

    } 

    @Test 

    public void test3() { 

    // Enter code here 

    assertEquals(6,ElMasGrande.elMasGrande(new int[]{-7, -20, 0, 6, -3, -9})); 

    } 

    @Test 

    public void test4() { 

    // Enter code here 

    assertEquals(0,ElMasGrande.elMasGrande(new int[]{-200, 0, -3, -5, -9, -18, -1})); 

    } 

    @Test 

    public void test5() { 

    // Enter code here 

    assertEquals(19,ElMasGrande.elMasGrande(new int[]{19, 18, 17, 16, 15, 14, 13, 12, 11})); 

    } 

    @Test 

    public void test6() { 

    // Enter code here 

    assertEquals(2000,ElMasGrande.elMasGrande(new int[]{750, 345, 1965, 2000, 545, 3, 0, 7})); 

    } 

    @Test 

    public void test7() { 

    // Enter code here 

    assertEquals(7,ElMasGrande.elMasGrande(new int[]{7, -7, 0})); 

    } 

    @Test 

    public void test8() { 

    // Enter code here 

    assertEquals(-2,ElMasGrande.elMasGrande(new int[]{-67, -34, -10, -2, -20, -3})); 

    } 

    @Test 

    public void test9() { 

    // Enter code here 

    assertEquals(52,ElMasGrande.elMasGrande(new int[]{50, 49, 52, 6, 10, 15, -400, 1})); 

    } 

    @Test 

    public void test10() { 

    // Enter code here 

    assertEquals(234,ElMasGrande.elMasGrande(new int[]{234, 111, 222, 192, 224, 233, 175, 15})); 

    } 
}
