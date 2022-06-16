import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicatedChar12 {

    public static void main(String[] args) {
        String name="enver";
        String country="We are living in USA and USA is a string country ";
        System.out.println(removeDuplicateds(name));
        System.out.println(removeDupilcates(name));
        System.out.println(removeDupilcateUserTochar(country));
    }

    //StringBuilder

    public static String removeDuplicateds(String str){
        char[] chArray=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char ch:chArray){
            if(sb.indexOf(String.valueOf(ch))==-1){
                sb.append(ch);

            }

        }
        return sb.toString();
    }
    //Hashset and StringBuilder
    public static String removeDupilcates(String str){
        char[] chaArray=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        Set<Character> chHashset=new HashSet<>();
        for(char c:chaArray){
            if(chHashset.add(c)){
                sb.append(c);


            }
        }
        return sb.toString();

    }

    // use toCharArray
    public static String removeDupilcateUserTochar(String str){
        return Arrays.asList(str.split(" ")).stream().distinct().collect(Collectors.joining());

    }



}
