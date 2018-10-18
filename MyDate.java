
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
    private int daysInMonth[] = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31}; 
    
    public MyDate() {
        this(1,1,2000);   
    }
    
    public MyDate(int month, int day, int year) {
        setMonth(month);        
        setYear(year);
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
    private boolean isLeapYear() {
        if(this.year % 4 == 0) {
            return true;
        }
        return false;
    }
    
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month. Out of range.");    
        }
        this.month = month;
    }
    
    public void setDay(int day) {
        int daysThisMonth = daysInMonth[this.month];
        if(isLeapYear() && this.month == 2) {
            ++daysThisMonth;
        }
        if(day < 0 || (day > daysThisMonth)) {
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
