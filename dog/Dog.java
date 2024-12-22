package dog;

public class Dog {

  // Attribute / Variabel karena di dalam Class Dog
  public int age;
  public String size;
  public String color;

  // constructor
  // nama constructor harus sama kayak nama Class
  // apakah constructor ini mirip dengan syntax self pada python?
  public Dog(int initialAge, String initalSize, String initialColor) {
    age = initialAge;
    size = initalSize;
    color = initialColor;
  }

  // Deklarasi Behavioural atau method / Hal - hal apa yang bisa dilakukan dalam Class Dog ini
  public void bark() {
    System.out.println("anjing menggongong");
  }
  // Deklarasi Behavioural atau method dalam objek
  public void eat() {
    System.out.println("anjing makan");
  }
  
  // Deklarasi Behavioural atau method dalam objek
  public void sleep() {
    System.out.println("anjing sedang tidur");
  }

  // Deklarasi Behavioural atau method dalam objek
  // Tidak menggunakan void sehingga harus menggunakan statement return
  public int getAge() {
    return age;
  }

  // Deklarasi Behavioural atau method dalam objek
  public void setAge(int newAge) {
    age = newAge;
  }

}
