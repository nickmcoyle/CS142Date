
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        System.out.println(date1);
        System.out.println(date1.getDaysInMonth() + " days this month");
        System.out.println("Is this a leap year? " + date1.isLeapYear());
        System.out.println("There are " + date1.getDaysInYear() + " days this year");
        System.out.println();
        
        MyDate date2 = new MyDate(2,28,1900);
        System.out.println(date2);
        System.out.println(date2.getDaysInMonth() + " days this month");
        System.out.println("Is this a leap year? " + date2.isLeapYear());
        System.out.println("There are " + date2.getDaysInYear() + " days this year");
        System.out.println();
        
        MyDate leapDate = new MyDate(2,29,2020);
        System.out.println(leapDate);
        System.out.println(leapDate.getDaysInMonth() + " days this month");
        System.out.println("Is this a leap year? " + leapDate.isLeapYear());
        System.out.println("There are " + leapDate.getDaysInYear() + " days this year");
        System.out.println();
        
        MyDate leapDate2 = new MyDate(2,29,1904);
        System.out.println(leapDate2);
        System.out.println(leapDate2.getDaysInMonth() + " days this month");
        System.out.println("Is this a leap year? " + leapDate2.isLeapYear());
        System.out.println("There are " + leapDate2.getDaysInYear() + " days this year");
        System.out.println();
        
        MyDate leapDate3 = new MyDate(2,29,2000);
        System.out.println(leapDate3);
        System.out.println(leapDate3.getDaysInMonth() + " days this month");
        System.out.println("Is this a leap year? " + leapDate3.isLeapYear());
        System.out.println("There are " + leapDate3.getDaysInYear() + " days this year");
        System.out.println();
        
        //MyDate invalidDate = new MyDate(2,29,1900);
        //System.out.println(invalidDate);       
    }
}
