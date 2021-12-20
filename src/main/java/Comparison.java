import java.util.Date;
import java.util.List;

/**
 * Class with main methods of comparisons.
 */
public class Comparison {


    private long startTime;
    private long endTime;

    public void startTimer() {
        startTime = System.nanoTime();
    }

    public void stopTimer() {
        endTime = System.nanoTime();
    }

    public long getEstimatedTime(){
        return endTime - startTime;
    }
    /**
     * Check of Add-method
     *
     * @param list             ArrayList or LinkedList
     * @param amountOfElements number of iterations for this method
     * @return
     */
    public long checkAdd(List list, int amountOfElements) {

        startTimer();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(i);
        }
        stopTimer();
        return getEstimatedTime();
    }

    /**
     * Check of Get-method
     *
     * @param list             ArrayList or LinkedList
     * @param amountOfElements number of iterations for this method
     * @return
     */
    public long checkGet(List list, int amountOfElements) {
        startTimer();
        for (int i = 0; i < amountOfElements; i++) {
            int x = (int) list.get(i);
        }
        stopTimer();
        return getEstimatedTime();
    }

    /**
     * Check of Delete-method
     *
     * @param list             ArrayList or LinkedList
     * @param amountOfElements number of iterations for this method
     * @return
     */
    public long checkDelete(List list, int amountOfElements) {
        startTimer();
        for (int i = amountOfElements - 1; i >= 0; i--) {
            list.remove(i);
        }
        stopTimer();
        return getEstimatedTime();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}