

import java.util.Stack;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemovingAGincingCharecter13 {
    public static void main(String[] args) {
        String name="Ezmet J";
        System.out.println(RemoveCharecter(name,'J'));
        System.out.println(removerChracter2(name,'m'));
        System.out.println(RemoveCharacter3(name,'E'));
    }

    public  static  String RemoveCharecter(String str, char ch){
        //Pattern.valuseOf  escape special character such ad <,(,{,...
        return  str.replaceAll(Pattern.quote(String.valueOf(ch)),"");

    }

    public  static String removerChracter2(String str, char ch){
        StringBuilder sb=new StringBuilder();
        char[] chArray=str.toCharArray();
        for(char c:chArray){
            if(c!=ch){
                sb.append(c);

            }

        }
        return sb.toString();
    }


// After java 8
    public static  String RemoveCharacter3(String str, char ch){
        return str.chars().filter(c->c!=ch).mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining());


    }

    }
