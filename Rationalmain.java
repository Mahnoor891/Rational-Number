public class Rationalmain {
    public static void main(String[] args) {
        Rationalnumber r1 = new Rationalnumber();
        System.out.println("Numerator: " + r1.getNumerator());
        System.out.println("Denominator:" + r1.getdenominator());

        Rationalnumber r2 = new Rationalnumber();
        System.out.println("Numerator 2 " + r2.getNumerator());
        System.out.println("Denominator 2" + r2.getdenominator());

        // Finding LCM and Displaying
        System.out.println("LCM is : " + r1.LCM(r1.getdenominator(),r2.getdenominator()));
        // Now for Addition 
        Rationalnumber sum = r1.add(r2);
        sum.display();
        // For Subtraction 
        Rationalnumber diff = r1.subtract(r2);
        diff.display();
    }
    
}
