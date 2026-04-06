/*
File: Jawaban.java

Kunci jawaban latihan variabel Java

File ini berisi solusi dari 10 soal latihan tentang:
instance variable
class variable
constant
local variable
parameter
perbedaan antar object
method dengan parameter
penggunaan static counter

Semua contoh bisa langsung dijalankan.
  javac basic/03_variabel/soal_dan_jawaban/01/Jawaban.java
  Java -cp basic/03_variabel/soal_dan_jawaban/01 Jawaban
*/

public class Jawaban {

    /*
    Soal 1
    Instance variable speed

    Instance variable adalah variabel milik object
    setiap object memiliki nilai sendiri
    */

    int speed = 0;


    /*
    Soal 2
    Class variable numWheels

    Static berarti variabel dimiliki class
    bukan milik object
    */

    static int numWheels = 2;


    /*
    Soal 3
    Constant MAX_SPEED

    final berarti nilai tidak bisa diubah
    setelah diberikan nilai pertama
    */

    static final int MAX_SPEED = 120;


    /*
    Soal 8
    Static counter jumlah object

    setiap object dibuat
    counter bertambah 1
    */

    static int totalObject = 0;


    /*
    Soal 9
    Constant String APP_NAME
    */

    static final String APP_NAME = "Belajar Java Variabel";


    /*
    Constructor class

    Constructor otomatis dipanggil saat object dibuat
    Digunakan untuk menambah jumlah object
    */

    Jawaban() {

        totalObject++;

    }


    /*
    Method main adalah titik awal program
    */

    public static void main(String[] args) {

        /*
        Membuat object pertama
        */

        Jawaban obj1 = new Jawaban();


        /*
        Soal 1
        Mengubah instance variable speed
        */

        obj1.speed = 40;

        System.out.println("Soal 1 Speed obj1: " + obj1.speed);


        /*
        Soal 2
        Mengakses class variable
        menggunakan nama class
        */

        System.out.println("Soal 2 Jumlah roda: " + Jawaban.numWheels);


        /*
        Soal 3
        Menampilkan constant
        */

        System.out.println("Soal 3 Max speed: " + MAX_SPEED);


        /*
        Soal 4
        Local variable

        Local variable hanya bisa digunakan
        di dalam method tempat dibuat
        */

        int distance = 15;

        System.out.println("Soal 4 Distance: " + distance);


        /*
        Soal 5
        Memanggil method setSpeed
        */

        obj1.setSpeed(50);


        /*
        Soal 6
        Memanggil method calculateTime
        */

        obj1.calculateTime(100, 20);


        /*
        Soal 7
        Membuat object kedua

        Tujuan soal ini memahami
        instance variable berbeda tiap object
        */

        Jawaban obj2 = new Jawaban();

        obj1.speed = 20;
        obj2.speed = 60;

        System.out.println("Soal 7 Speed obj1: " + obj1.speed);
        System.out.println("Soal 7 Speed obj2: " + obj2.speed);


        /*
        Soal 8
        Menampilkan jumlah object
        */

        System.out.println("Soal 8 Total object: " + totalObject);


        /*
        Soal 9
        Menampilkan constant String
        */

        System.out.println("Soal 9 App name: " + APP_NAME);


        /*
        Soal 10
        Memanggil method showInfo
        */

        obj1.showInfo("Budi", 50);

    }



    /*
    Soal 5
    Method dengan parameter

    parameter newSpeed digunakan
    untuk mengubah instance variable speed
    */

    void setSpeed(int newSpeed) {

        speed = newSpeed;

        System.out.println("Soal 5 Speed baru: " + speed);

    }



    /*
    Soal 6
    Method dengan dua parameter

    membuat local variable time
    menghitung distance / speed
    */

    void calculateTime(int distance, int speed) {

        int time = distance / speed;

        System.out.println("Soal 6 Time: " + time);

    }



    /*
    Soal 10
    Method dengan dua parameter

    parameter name bertipe String
    parameter speed bertipe int

    method menampilkan informasi sederhana
    */

    void showInfo(String name, int speed) {

        System.out.println("Soal 10 Name: " + name);
        System.out.println("Soal 10 Speed: " + speed);

    }

}