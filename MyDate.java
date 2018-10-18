
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
        if(this.year % 4 == 0 && this.year % 100 != 0 || this.year % 100 == 0 && this.year % 400 == 0) {
            return true;
        }
        return false;
    }
    
    public int getDaysInMonth() {
        int daysInMonths[] = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31}; 
        int daysInMonth = daysInMonths[this.month];
        if(this.isLeapYear() && this.month == 2) {
            ++daysInMonth;
        }
        return daysInMonth;
    }
    
    public int getDaysInYear() {
        int daysInYear = 365;
        if(this.isLeapYear()) {
            ++daysInYear;   
        }
        return daysInYear;
    }
    
    public void getNextDay() {
        if(this.day + 1 > this.getDaysInMonth() && this.month + 1 > 12) {
            this.setMonth(1);
            this.setDay(1);
            this.setYear(++this.year);
        } else if (this.day + 1 > this.getDaysInMonth()) {
            this.setMonth(++this.month);
            this.setDay(1);
        } else {
            this.setDay(++this.day);
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
