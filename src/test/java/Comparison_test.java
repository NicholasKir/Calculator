import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class for testing
 */
class ComparisonTest {
    /**
     * Add-method test
     */
    @Test
    void checkAdd() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertEquals(new Comparison().checkAdd(arrayList, 10000),1);
    }
    /**
     * Get-method test
     */
    @Test
    void checkGet() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<20000;i++) {
            arrayList.add(i);
        }
        assertEquals(new Comparison().checkGet(arrayList, 20000),2);
    }
    /**
     * Get-method test
     */
    @Test
    void checkDelete() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<20000;i++) {
            arrayList.add(i);
        }
        assertEquals(new Comparison().checkDelete(arrayList, 20000),1);
    }
}