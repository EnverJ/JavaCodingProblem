

public class reverse {

    public static void main(String[] args) {
        String name="Ezmet";
    //    System.out.println(new  StringBuilder(name).reverse().toString());
        reverseSB(name);


    }
    public static String reverseSB(String str){

return new StringBuilder(str).reverse().toString();

    }}
