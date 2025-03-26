class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters and Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}


public class DateTest {
    public static void main(String[] args) {
        // Creating Date object
        Date myDate = new Date(25, 03, 2025);

        // Displaying initial date
        System.out.print("Initial Date: ");
        myDate.displayDate();

        // Modifying date using setters
      
        myDate.setDay(31);
        myDate.setMonth(12);
        myDate.setYear(2025);

        // Displaying updated date
        System.out.print("Updated Date: ");
        myDate.displayDate();
    }
}
