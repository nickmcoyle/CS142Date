
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
        
        MyDate leapDate = new MyDate(2,29,2020);
        System.out.println(leapDate);
        
        MyDate invalidDate = new MyDate(2,31,2018);        
        MyDate invalidDate2 = new MyDate(2,29,2018);
    }
}
