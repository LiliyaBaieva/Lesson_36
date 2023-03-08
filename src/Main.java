public class Main {
  public static void main(String[] args) {
   Car myCar = new Car("Tesla model S");
   Car secondCar = new Car("Tesla model X", "IA123");
   Car anotherCar = new Car("Tesla model Y", "AA567");

// для вызова метода мы пишем: имяОбъекта.метод(аргументы)
   System.out.println(anotherCar.getInfo());

   myCar.setPlate("DE 123"); // задали номер - раньше его не было, было значение по умолчанию
   anotherCar.setPlate("DE 567");
   System.out.println("myCar: " + myCar.getInfo());
   System.out.println("anotherCar: " + anotherCar.getInfo());
   System.out.println();
   System.out.println("Модель anotherCar: " + anotherCar.getModel());

   myCar.setDriverAge(15);
   System.out.println("myCar.DriverAge = " + myCar.getDriverAge());
   System.out.println("Минимальный возраст для управления автомобилем = " + Car.getMinimalAge());

   Car.setMinimalAge(14);
   anotherCar.setDriverAge(15);
   System.out.println("anotherCar.DriverAge = " + anotherCar.getDriverAge());




  }



}