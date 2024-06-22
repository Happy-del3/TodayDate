public class TodayDate {
  
    public static void main(String[] args) {
        // Declare variables and constants
        java.time.LocalDate date = java.time.LocalDate.now();
        java.time.LocalTime time = java.time.LocalTime.now();
        
        System.out.println("Date: " + date + "\n" +
                           "Time: " + time);
    }
    
}
