import java.util.*;

public class Main {
    public static void main(String[] args) {

        String name = "محمد علي";
        int studentId = 12345;

        List<? super Number> list = new ArrayList<Object>();

        list.add(11);
        list.add(78);
        list.add(69);

        System.out.println("اسم الطالب: " + name);
        System.out.println("رقم القيد: " + studentId);

        for (Object x : list) {
            System.out.println(x);
        }
    }
}
