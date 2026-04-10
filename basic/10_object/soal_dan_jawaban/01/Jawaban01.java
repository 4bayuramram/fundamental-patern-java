/*
File: Jawaban01.java
Deskripsi: Jawaban lengkap 10 soal Java tentang Object.
File ini dibuat untuk membantu pemula memahami class, object, constructor, method, instance variable, static variable, dan static method.
Setiap soal dijawab dengan kode, penjelasan syntax, pola jawaban, serta output yang muncul di terminal.
*/
// compile : javac basic/10_object/soal_dan_jawaban/01/Jawaban01.java
// run : java -cp basic/10_object/soal_dan_jawaban/01 Jawaban01 

public class Jawaban01 {

    /* 
    ===============================
    1. Membuat class Car dengan instance variable color dan speed
    ===============================
    Penjelasan:
    - Class adalah blueprint/kerangka untuk membuat object.
    - Instance variable adalah data yang dimiliki tiap object.
    - Syntax 'String color;' membuat variabel teks.
    - Syntax 'int speed;' membuat variabel angka.
    - Pola: tipe_data nama_variabel;
    */
    String color; // Menyimpan warna mobil
    int speed;    // Menyimpan kecepatan mobil

    /*
    ===============================
    5 & 6. Membuat Constructor
    ===============================
    Penjelasan:
    - Constructor adalah method khusus untuk menginisialisasi object saat dibuat.
    - Constructor default: tanpa parameter, memberi nilai default.
    - Constructor dengan parameter: memberi nilai sesuai input saat object dibuat.
    - Pola: 
      ClassName() { ... } // default
      ClassName(tipe1 param1, tipe2 param2) { ... } // parameter
    */
    public Jawaban01() {
        this.color = "Blue"; // Default color
        this.speed = 0;      // Default speed
    }

    public Jawaban01(String color, int speed) {
        this.color = color; // Set warna sesuai input
        this.speed = speed; // Set speed sesuai input
    }

    /*
    ===============================
    3 & 4. Membuat method drive dan stop
    ===============================
    Penjelasan:
    - Method adalah behavior dari object.
    - 'drive' menambah speed.
    - 'stop' mengubah speed menjadi 0.
    - 'this.speed' mengacu pada instance variable dari object saat ini.
    - Pola: tipe_return methodName(parameter) { ... }
    */
    void drive(int increaseSpeed) {
        this.speed += increaseSpeed; // Tambah kecepatan
        System.out.println("Driving at speed: " + this.speed);
    }

    void stop() {
        this.speed = 0; // Set kecepatan ke 0
        System.out.println("Car stopped.");
    }

    /*
    ===============================
    7 & 8. Static variable dan method
    ===============================
    Penjelasan:
    - Static variable dimiliki class, bukan object.
    - Static method bisa dipanggil tanpa object.
    - Pola: 
      static tipe_data nama_variabel;
      static tipe_return nama_method() { ... }
    */
    static int totalCars = 0; // Hitung jumlah object dibuat

    static void showTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }

    /*
    ===============================
    2, 9, 10. Main method untuk membuat object dan memanggil method
    ===============================
    Penjelasan:
    - Main method adalah titik awal program.
    - Buat object menggunakan constructor.
    - Panggil method drive() dan stop() untuk melihat perubahan speed.
    - Tampilkan totalCars menggunakan static method.
    - Pola membuat object:
      ClassName objectName = new ClassName([parameter]);
    */
    public static void main(String[] args) {

        /*
        Soal 2 & 9:
        Membuat object menggunakan constructor default dan parameter
        */
        Jawaban01 car1 = new Jawaban01(); // Default constructor
        totalCars++; // Tambah jumlah object

        Jawaban01 car2 = new Jawaban01("Red", 50); // Constructor dengan parameter
        totalCars++; // Tambah jumlah object

        /*
        Menampilkan state awal tiap object
        */
        System.out.println("Car1 color: " + car1.color); // Output: Blue
        System.out.println("Car1 speed: " + car1.speed); // Output: 0

        System.out.println("Car2 color: " + car2.color); // Output: Red
        System.out.println("Car2 speed: " + car2.speed); // Output: 50

        /*
        Soal 10: Memanggil method drive dan stop
        Pola: objectName.methodName(arguments);
        */
        car1.drive(30); // Output: Driving at speed: 30
        car1.stop();    // Output: Car stopped.

        car2.drive(20); // Output: Driving at speed: 70
        car2.stop();    // Output: Car stopped.

        /*
        Menampilkan totalCars
        */
        Jawaban01.showTotalCars(); // Output: Total cars created: 2
    }
}

/*
===============================
Keterangan Output Terminal
===============================
1. Car1 color: Blue
2. Car1 speed: 0
3. Car2 color: Red
4. Car2 speed: 50
5. Driving at speed: 30
6. Car stopped.
7. Driving at speed: 70
8. Car stopped.
9. Total cars created: 2

===============================
Kesimpulan dari 10 soal
===============================
1. Pemula belajar membuat class dan object.
2. Memahami perbedaan constructor default dan parameter.
3. Mengerti instance variable (state object).
4. Memahami method (behavior object) seperti drive dan stop.
5. Belajar static variable dan static method.
6. Bisa membuat dan memanggil object di main method.
7. Paham penggunaan 'this' untuk instance variable.
8. Mengerti cara menghitung jumlah object yang dibuat.
9. Mengetahui output yang dihasilkan oleh setiap method.
10. Memahami alur pemrograman berbasis object secara lengkap.

File ini bisa dibaca sambil dicoba menjalankan program agar pemula mengerti setiap langkah.
*/