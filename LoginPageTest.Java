public class GetDaysOfWeek {
 
    // main driver method
    public static void main(String[] args)
    {
        int day = 2;
        String dayType;
        String dayString;
 
        if(day == 1){
            dayString = "Monday";
        }else if(day == 2){
            dayString = "Tuesday";
        }else if(day == 3){
            dayString = "Wednesday";
        }else if(day == 4){
            dayString = "Thursday";
        }else if(day == 5){
            dayString = "Friday";
        }else if(day == 6){
            dayString = "Saturday"
        }else if(day == 7){
            dayString = "Sunday";
        }else{
            dayString = "Invalid day"
        }
 
        if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5){
            dayType = "Weekday";
        }else if (day == 6 || day == 7){
            dayType = "Weekend";
        }else {
            dayType = "Invalid daytype";
        }
 
        System.out.println(dayString + " is a " + dayType);
    }
}
