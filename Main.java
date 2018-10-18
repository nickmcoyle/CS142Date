
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
        
        MyDate leapDate2 = new MyDate(2,29,1904);
        System.out.println(leapDate2);       
        
        MyDate leapDate3 = new MyDate(2,29,2000);
        System.out.println(leapDate3);
        
        MyDate invalidDate = new MyDate(2,29,1900);
        System.out.println(invalidDate);       
    }
}
