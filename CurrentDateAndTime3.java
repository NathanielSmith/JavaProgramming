
/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/6/15
 * Prints out the current date and time
 */
import java.util.*;

public class CurrentDateAndTime {
    
    public static void main(String[] args){
        
        int day, month, year;
        int sec, min, hour;
        GregorianCalendar date = new GregorianCalendar();
        
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        
        sec = date.get(Calendar.SECOND);
        min = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
        
        System.out.println("Current date is: "+(month+1)+"/"+day+"/"+year);
        System.out.println("Current time is: "+hour+" : "+min+" : "+sec);
       
    }
}

