public class Vectormain {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.addCoordinate(1.0);
        v1.addCoordinate(2.0);
        v1.addCoordinate(3.0);

        Vector v2 = new Vector();
        v2. addCoordinate(4.0);
        v2. addCoordinate(5.0);
        v2. addCoordinate(6.0);

        Vector v3 = v1.add(v2);
        System.out.println("The sum of v1 and v2 is: " + v3);

        Vector v4 = v1.clone();
        System.out.println("The cloned vector v4 is : " + v4);

        System.out.println("Is v1 equals to v4? " + v1.equals(v4));
        System.out.println("Is v1 equals to v2? " + v1.equals(v2));

        System.out.println("Values of v2: " + v2);
        for(double val : v2){
        System.out.println(val + " "); }

    }
    
}
