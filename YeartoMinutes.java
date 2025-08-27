import java.util.Scanner;
class YeartoMinutes{
    public static void main(String[] args) {
        double time=60*24*365;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the minutes: ");
            double min=scan.nextDouble();
            long years=(long)(min/time);
            int days=(int)(min/60*24)%365;
                    System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
        }
        catch(Exception e){
            System.out.println("Enter the Valid Input...!");
        }
    }
}