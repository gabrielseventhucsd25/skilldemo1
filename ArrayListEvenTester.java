import org.junit.*;
import static org.junit.Assert.*;

public class ArrayListEvenTester{
    int[] arr, arr2;
    ArrayListEven list1, list2;

    @Before
    public void setUp(){
        arr = new int[]{2, 4, 6, 8, 10};
	    arr2 = new int[]{2, 8, 3, 12, 20};
	    list1 = new ArrayListEven(arr);
	    list2 = new ArrayListEven(arr2);
        }

    @Test
    public void testIsEven(){
        setUp();
	    assertTrue("list has all even so true", list1.isEven());
	    assertFalse("list has one odd so false", list2.isEven());
        }
}
