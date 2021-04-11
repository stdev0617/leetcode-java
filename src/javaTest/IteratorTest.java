package javaTest;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public void iteratorTest() {
        System.out.println("List 생성");
        ArrayList list = new ArrayList();
        list.add("일");
        list.add("월");
        list.add("수");
        Iterator iter = (Iterator) list.iterator();
        while(iter.hasNext()) {
            String day = (String) iter.next();
            if (day.equals("수")) {
                iter.remove();
                System.out.println("removed day: "+day);
            }
        }

        System.out.println("---------------------");

        iter = list.iterator();
        while(iter.hasNext()) {
            String day = (String) iter.next();
            System.out.println("Day : " + day);
        }
    }
}
