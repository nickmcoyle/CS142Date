
/**
 * A dateclass that validates dates taking leap year into account
 *
 * @author Nick Coyle
 * @version 10.18.2018
 */
public class MyDate
{
    private int day;
    private int month;
    private int year;        
    
    public MyDate() {
        this(1,1,2000);   
    }
    
    public MyDate(int month, int day, int year) {
        setMonth(month);        
        setYear(year);
        //we need to know what month AND what year it is before we set the day
        //how can we guarantee that the day will not be set before the month and year??? 
        setDay(day); 
    }
    
    /**
     * A method to override the toString() method for our date object
     */
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }
    
    /**
     * A method to check if it is a leap year
     */
    public boolean isLeapYear() {
        return(this.year % 4 == 0 && this.year % 100 != 0 || (this.year % 100 == 0 && this.year % 400 == 0));
    }
    
    public int getDaysInMonth() {
        /*
         * int daysInMonths[] = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31}; 
         * int daysInMonth = daysInMonths[month];
         */        
        int daysInMonth = 31;  
        if(month == 2) {
            if(isLeapYear() ) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        }
        return daysInMonth;
    }
    
    public int getDaysInYear() {
        int daysInYear = 365;
        if(isLeapYear()) {
            daysInYear = 366;   
        }
        return daysInYear;
    }
    
    public void getNextDay() {
        ++day;
        if(day > getDaysInMonth() && month + 1 > 12) {
            month = 1;
            day = 1;
            ++year;
        } else if (day > getDaysInMonth()) {
            ++month;
            day = 1;
        }
    }
    
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month. Out of range.");    
        }
        this.month = month;
    }
    
    public void setDay(int day) {              
        if(day < 0 || day > this.getDaysInMonth()) {
            throw new IllegalArgumentException("Invalid day. Out of range.");    
        }
        this.day = day;
    }
    
    public void setYear(int year) {
        if(year < 0) {
            throw new IllegalArgumentException("Invalid year. Out of range.");    
        }
        this.year = year;
    }    
}
