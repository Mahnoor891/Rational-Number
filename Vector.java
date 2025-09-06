import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Vector implements Cloneable, Iterable<Double> {
   private List<Double> coordinates;

   public Vector() {
      this.coordinates = new ArrayList<>();
   }

   public Vector(List<Double> values) {
      this.coordinates = new ArrayList<>(values);
   }

   public void addCoordinate(double var1) {
      this.coordinates.add(var1);
   }

   public double get(int i) {
      return (Double)this.coordinates.get(i);
   }

   public void set(int i, double val) {
      this.coordinates.set(i, val);
   }

   public int length() {
      return this.coordinates.size();
   }

   public Vector add(Vector other) {
      if (this.length() != other.length()) {
         throw new IllegalArgumentException(" Vector should have same dimensions");
      }
      List<Double> newCoords = new ArrayList<>();

         for(int i = 0; i < this.length(); ++i) {
            newCoords.add(this.get(i) + other.get(i));
         }

         return new Vector(newCoords);
      }
   public Vector sub(Vector other){
       if (this.length() != other.length()) {
         throw new IllegalArgumentException(" Vector should have same dimensions");
      }
      Vector result = new Vector();
      for(int i = 0; i<this.length();i++){
         result.coordinates.add(this.get(i)-other.get(i);
      }
      return result;
   }
   pubic double dotProduct(Vector other){
       if (this.length() != other.length()) {
         throw new IllegalArgumentException(" Vector should have same dimensions");
      }
      double result = 0;
      for(int i =0;i<this.length();i++){
         result += this.get(i)*other.get(i);
      }
      return result;
   }
   public Vector crossProduct(Vector other){
      if(this.length() != 3 || other.length() != 3){
         throw new IllegalArgumentException("CROSS PRODUCT is defined for 3-Dimensional VECTOR");
      }
       if (this.length() != other.length()) {
         throw new IllegalArgumentException(" Vector should have same dimensions");
      }
      double x1 = this.get(0);
      double y1 = this.get(1);
      double z1 = this.get(2);
      double x2 = other.get(0);
      double y2 = other.get(1);
      double z2 = other.get(2);

      Vector result = new Vector();
      result.coordinates.add(y1*z2-z1*y2); // x-component
      result.coordinates.add(z1*x2-x1*z2); // y-component
      result.coordinates.add(x1*y2-y1*x2); // z-component

      return result;

   public Vector clone() {
      return new Vector(this.coordinates);
   }

   @Override
   public String toString() {
      return this.coordinates.toString();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof Vector)) {
         return false;
      } else {
         Vector vector = (Vector) o;
         return Objects.equals(coordinates, this.coordinates);
      }
   }

   @Override
   public Iterator<Double> iterator() {
      return this.coordinates.iterator();
   }
}

    

