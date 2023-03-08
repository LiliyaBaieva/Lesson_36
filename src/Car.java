public class Car {
  private double enginePower;
  private String model;
  private String plate;
  private static int minimalAge = 18; // нинкак не связан с конкретной машины, один для всех
  private int driverAge;

  public Car(){
    this.model = "UNKNOWN MODEL";
    this.plate = "NO PLATE";
  }
  public Car(String model){
    this.model = model;   // this в любом методе - обращение к ТЕКУЩЕМУ объекту
  }

  public Car(String model, String plate){
    this.model = model;
    this.plate = plate;
  }
  // Конструкторов может быть несколько -- а может быть только один. Решать вам.

  public Car(String model, String plate, double power){
    this.model = model;
    this.plate = plate;
    enginePower = power;
  }

  public String getInfo(){
    return String.format("%s: %s, (%f)", model, plate, enginePower);
  }

  public void setPlate(String plate){
    this.plate = plate;
  }





}
