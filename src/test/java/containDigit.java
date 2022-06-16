public class containDigit {
    public containDigit(String name) {
    }

    public static void main(String[] args) {
        String name="00";
     //   String name="Ezmet 5";
        System.out.println(containOnlyDigit(name));

    }
    public static boolean containOnlyDigit(String str){
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;

            }
        }
        return true;
    }
}
