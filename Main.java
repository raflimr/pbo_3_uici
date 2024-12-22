import dog.*;
import tugas.Mobil;


class Main {
  public static void main(String[] args) {

    // constructor
    Dog dog = new Dog(13, "Small", "White");
    // Dog dog = new Dog();

    // akses atribut dan set nilai atribut nya
    // dog.age = 15;
    // dog.size = "Big";
    // dog.color = "Yellow";

    // akses method
    dog.bark();
    dog.eat();
    dog.sleep();
    dog.setAge(18);
    System.out.println("dog age: " + dog.getAge());

    // instance of menghasilkan nilai Boolean berupa nilai True or False
    // mengecek apakah objek dog ini mengambil class dari class Dog
    if (dog instanceof Dog) {
      System.out.println("objek dog adalah instance dari class Dog");
    }

  

    /*-------- Tugas -------------- */
    System.out.println("/*-------- Tugas -------------- */");
    Mobil mobilSaya = new Mobil(2002, "Mazda", "Merah");

    // Menampilkan informasi mobil
    mobilSaya.tampilkanMobil();
  
    // Menampilkan Deskripsi mobil 
    String deskripsi = mobilSaya.getDeskripsiMobil();
    System.out.println(deskripsi);

    // Mengubah nama Mobil
    mobilSaya.setNamaMobil("Kijang");

    // Mengubah warna Mobil
    mobilSaya.setWarnaMobil("Hitam");

    // Menampilkan Deskripsi mobil
    String deskripsi_2 = mobilSaya.getDeskripsiMobil();
    System.out.println(deskripsi_2);

  }
}
