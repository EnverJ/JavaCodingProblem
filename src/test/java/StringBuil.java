public class StringBuil {
    public static void main(String[] args) {
        String name = "David";
        System.out.println(reverse(name));

    }

    public static String reverse(String Str) {

return new StringBuilder(Str).reverse().toString();
    }
}
