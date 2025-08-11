public class Rationalmain {
    public static void main(String[] args) {
        Rationalnumber r1 = new Rationalnumber();
        Rationalnumber r2 = new Rationalnumber();

        // Finding LCM and Displaying
        System.out.println("LCM is : " + r1.LCM(r1.getdenominator(),r2.getdenominator()));
        // Now for Addition 
        Rationalnumber sum = r1.add(r2);
        System.out.println("Sum: " + sum);
        // For Subtraction 
        Rationalnumber diff = r1.subtract(r2);
        System.out.println("Subtract: " + diff);
    }
    
}
