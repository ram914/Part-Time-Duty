package exception;

public class IdentifyException {
    public static void main(String[] args) {
        try {
            ProductionWorker e = new ProductionWorker();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter Employee Number");
            e.setEmployeeNumber(sc.nextInt());
            if (e.getEmployeeNumber() == 9999) {
                throw new InvalidEmployeeNumberException("Employee Number Entered is Invalid");
            }
            System.out.println("Please enter a Shift");
            String shift = sc.next();
            e.setShift(shift);
            if (shift.equalsIgnoreCase("Noon")) {
                throw new Exception("Invalid Shift entered");
            }
            System.out.println("Please enter a Pay rate");
            e.setRate(sc.nextDouble());
            if (e.getRate() < 0) {
                throw new InvalidPayRate("Invalid Pay rate entered");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}
