//: object/HelloDate.java
import java.util.*;

/** Первая программа-пример книги.
 * Выводит строку и текущую дату.
 * @author Брюс Эккель
 * @author Nekregor
 * @version 4.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws exceptions Исключения не выдаются
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
//        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
} /* Output: (55% match)
Привет, сегодня:
Wed Oct 05 14:39:36 MDT 2005
*///:~
