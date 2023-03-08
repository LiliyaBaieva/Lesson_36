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
  // если поле - например, enginePower - не инициализируется в конструкторе, то оно так и остаётся
  // пустым - c null для классов и 0 для примитивных типов

  public Car(String model, String plate){
    this.model = model;
    this.plate = plate;
  }
  // Конструкторов может быть несколько -- а может быть только один. Решать вам.

  public Car(String model, String plate, double power){
    this.model = model;
    this.plate = plate;
    enginePower = power;  // можно не писать this, если не с чем перепутать
  }

  // метод, который напечатает информацию о конкретном объекте в консоль
  // нарушение инкапсуляции - класс Car не должен думать ни про консоль, ни про файлы
  public void printInfo() {
    System.out.printf("%s: %s (%f)%n", model, plate, enginePower);
  }

  // метод, который отдаст информацию о конкретном объекте в виде строки
  public String getInfo(){
    return String.format("%s: %s, (%f)", model, plate, enginePower);
  }

  public void setPlate(String plate){
    this.plate = plate;
  }

  public void setModel(String model){
    // здесь, как и в любом сеттере, может быть проверка корректности
    this.model = model;
  }


  // Геттеры создаются сразу для всех атрибутов, которые пользователь (другой код) должен
  // иметь возможность смотреть.
  public String getModel(){
    return model;
  }

  public String getPlate(){
    return plate;
  }

  public Double getEnginePower(){
    return enginePower;
  }

  // нельзя написать this - метод статичный и ничего не знает про конкретный объект
  public static void setMinimalAge(int minimalAge){
    Car.minimalAge = minimalAge;
  }

  public void setDriverAge(int age) {
    if(age < minimalAge){
      System.out.println("Возраст " + age + " недостаточен для управлеения автомобилем.");
      return;
    }
    driverAge = age;
  }

  public  int getDriverAge() {
   return driverAge;
  }

  public static int getMinimalAge() {
    return minimalAge;
  }




}
