package advancedOOP;

import java.time.Year;

public class Date {
    private  int day;
    private  int month;
    private  int year;
    public Date(int day, int month, int year){
        validateDay(day);
        if (month== 2 && !validateYear(year) && day> 28){
            System.out.println("This is not a leap year!");
        }
        if (month==2 && day>= 30){
            System.out.println("February does not have 30");
        }
        if ((month==4 && day<30)||(month==6 && day>30)||(month==9 && day>30)||(month==11 && day>30)){
            System.out.printf("month %d does not have more than 30 days", month);
        }
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public Date(){

    }
    public int getDay(){
        return day;

    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        validateMonth(month);
        this.month = month;
    }

    private void validateMonth(int month) {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        validateYear(year);
        if (validateCurrentYear(year)){
        this.year = year;
        }
    }
    private boolean validateDay(int day){
        if (day<1 || day>31){
            System.out.println("Ensure the is within the accepted range");
            return false;
        }
        return true;
    }
    private boolean validateYear(int year){
        if (year%4==0){
            return true;
        }
        return year % 4 == 0;
    }
    private boolean validateCurrentYear(int year){
        int currentYear=Integer.parseInt(String.valueOf(Year.now()));
        System.out.println("Insert a year lesser than the current year");
        return (year<=currentYear);
    }
    @Override
    public String toString(){
        return
                getDay()+"-"+
                getMonth()+"-"+
                getYear()
                ;
    }
    //dd-mm-yy
    public void displayDate(){
        System.out.printf("%d-%d-%d", getDay(),getMonth(),getYear());
    }

}
