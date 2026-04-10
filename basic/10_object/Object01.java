/*
Materi Java: Object (Objek)

/*
Penjelasan dasar tentang Object di Java

Object adalah instansiasi dari sebuah class.
Object memiliki state (atribut/variabel), behavior (method), dan identity (unik di memori).

Java adalah bahasa berorientasi objek (OOP), sehingga hampir semua hal dipahami sebagai object.

Tujuan penggunaan object:
- Memodelkan dunia nyata
- Mengorganisir kode program menjadi modul reusable
- Memudahkan pemeliharaan program besar
*/

/*
File ini menjelaskan:
1. Membuat Object dari Class
2. Akses Instance Variable dan Method
3. Constructor
4. Overloading Constructor
5. Static Method dan Variable
6. Aturan penamaan Object
*/

// compile : javac basic/10_object/Object01.java
// run : java -cp basic/10_object Object01
public class Object01 {

    /*
    Instance Variable (state dari object)
    */

    String color;
    int speed;

    /*
    Constructor untuk membuat object dengan state awal
    */

    public Object01(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    /*
    Constructor default
    */

    public Object01() {
        this.color = "Red";
        this.speed = 0;
    }

    /*
    Method (behavior dari object)
    */

    void drive(int increaseSpeed) {
        speed += increaseSpeed;
        System.out.println("Driving at speed: " + speed);
    }

    void stop() {
        speed = 0;
        System.out.println("Car stopped.");
    }

    /*
    Static Variable (dimiliki class, bukan object)
    */

    static int totalCars = 0;

    /*
    Static Method (dimiliki class)
    */

    static void showTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }

    /*
    Method utama program
    */

    public static void main(String[] args) {

        /*
        Membuat object menggunakan constructor default
        */

        Object01 car1 = new Object01();
        totalCars++;

        /*
        Membuat object menggunakan constructor dengan parameter
        */

        Object01 car2 = new Object01("Blue", 50);
        totalCars++;

        /*
        Mengakses Instance Variable dan Method
        */

        System.out.println("Car1 color: " + car1.color);
        car1.drive(30);
        car1.stop();

        System.out.println("Car2 color: " + car2.color);
        car2.drive(20);

        /*
        Mengakses Static Method
        */

        Object01.showTotalCars();

    }

}

/*
Aturan Penamaan Object di Java

1. Case Sensitive
car1 berbeda dengan Car1

2. Harus diawali huruf
contoh benar:
myCar
fastBike

contoh tidak disarankan:
_car
$vehicle

3. Gunakan camelCase jika lebih dari satu kata
contoh:
myFastCar
newBike

4. Hindari menggunakan keyword Java
contoh salah:
int new = 10;

5. Object biasanya menggunakan huruf kecil di awal
contoh:
car1
bike2
*/