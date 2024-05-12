import java.util.*;

public class LinkListFun {

    public static void main(String[] args) {

        LinkedList<String> a1 = new LinkedList<String>();

        a1.add("yah");
        a1.add("vay");
        a1.add("kay");
        a1.add("ray");
        a1.add("ta");
        Iterator<String> i1 = a1.iterator();
        while (i1.hasNext()) {

            System.out.println(i1.next());
        }

    }

}
