// Import java.util.*;
public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Gaurav ");
        System.out.println(str);
        str.append("Kumar");
        System.out.println(str);
        str.setCharAt(0, 'g');
        System.out.println(str);
        str.insert(1,'a');
        System.out.println();
        str.deleteCharAt(1);
        System.out.println(str);
    }
}
