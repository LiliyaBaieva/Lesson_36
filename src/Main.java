public class Main {
  public static void main(String[] args) {
   Car myCar = new Car("Tesla model S");
   Car secondCar = new Car("Tesla model X", "IA123");
   Car anotherCar = new Car("Tesla model Y", "AA567");

   System.out.println(anotherCar.getInfo());

  }



}