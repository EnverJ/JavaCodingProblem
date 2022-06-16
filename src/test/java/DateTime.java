import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTime {


    public static void main(String[] args) {
        ld();
        System.out.println("=====================");
        System.out.println(diff());

    }

    public static void ld(){
        LocalDate ld=LocalDate.now();

        System.out.println(ld);
    }


public static String diff(){
    LocalDate   pd=LocalDate.of(2021,11,8);
    LocalDate   fd=LocalDate.of(2022,2,3);
    Period perriodBetween=Period.between(pd,fd);
    return perriodBetween.getYears()+" Year "+perriodBetween.getMonths()+" Monthes "+perriodBetween.getDays()+" Days";


}
public static void dates(){
        LocalDate ld=LocalDate.of(2021,11,8);
    LocalDateTime ldStart=ld.atStartOfDay();
    // LocalDateTime ldStart2=LocalDateTime.of(ld, LocalTime.from(ld.MIN))

}




}
