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
   

   public Vector clone() {
      return new Vector(this.coordinates);
   }

   public String toString() {
      return this.coordinates.toString();
   }

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

   public Iterator<Double> iterator() {
      return this.coordinates.iterator();
   }
}

    

