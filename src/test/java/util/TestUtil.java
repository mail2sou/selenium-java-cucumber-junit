package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TestUtil {

    public static long Page_load_Timeout = 60;
    public static long Implicit_wait = 20;

    public static String getCurrentDate() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        return date;
    }

    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
        return timeStamp;
    }

    public static String randomNumber() {
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1000);
        String ranNo = "SP" + Integer.toString(rand_int1);
        // System.out.println("RandomNo"+ranNo);
        return ranNo;
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static boolean isListSorted(List<String> listOfStrings) {
        if (listOfStrings.size() == 0 || listOfStrings.size() == 1) {
            return true;
        }
        Iterator<String> it = listOfStrings.iterator();
        String current, previous = it.next();
        while (it.hasNext()) {
            current = it.next();
            if (previous.compareTo(current) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

}
