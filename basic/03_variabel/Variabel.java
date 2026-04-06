/*
Materi Java: Variables (Variabel)

/*
Penjelasan dasar tentang variabel di Java

Variabel di Java adalah tempat menyimpan data dengan tipe tertentu.
Setiap variabel harus memiliki tipe data yang jelas sejak awal.

Contoh:
int speed = 10;

int = tipe data
speed = nama variabel
10 = nilai variabel

Java adalah bahasa pemrograman bertipe statis (static typed language)
artinya tipe variabel harus ditentukan saat dibuat dan tidak bisa berubah.

Contoh:
int angka = 10;   benar
angka = "halo";   salah karena tipe berubah

Berbeda dengan JavaScript yang bertipe dinamis (dynamic typed language)

Contoh JavaScript:
let data = 10;
data = "halo";   masih boleh

Sedangkan di Java tidak boleh seperti itu.

Tujuan sistem tipe tetap di Java adalah:
membuat program lebih aman
mengurangi error saat program berjalan
memudahkan membaca struktur program besar

Sebelum mempelajari jenis variabel di Java
pahami bahwa setiap variabel selalu memiliki:
tipe data
nama variabel
nilai (optional saat deklarasi tergantung jenis variabel)
*/

/*
File ini menjelaskan:
1. Instance Variable
2. Class Variable (static)
3. Local Variable
4. Parameter
5. Aturan penamaan variabel

Semua contoh bisa langsung dijalankan.

Cara compile dan run:

javac basic/03_variabel/Variabel.java
java -cp basic/03_variabel Variabel
*/

public class Variabel {

    /*
    Instance Variable (Non-static Field)

    Variabel ini milik object.
    Setiap object memiliki nilai berbeda.
    */

    int speed = 0;


    /*
    Class Variable (Static Field)

    Variabel static milik class.
    Semua object berbagi nilai yang sama.
    */

    static int numGears = 6;


    /*
    Constant Variable (Static Final)

    final artinya nilai tidak bisa diubah setelah diberikan nilai awal.
    */

    static final int MAX_SPEED = 120;


    /*
    Method utama program Java
    */

    public static void main(String[] args) {

        /*
        Membuat object dari class Variabel
        */

        Variabel sepeda = new Variabel();


        /*
        Mengakses Instance Variable
        */

        sepeda.speed = 25;


        /*
        Mengakses Class Variable
        */

        Variabel.numGears = 6;


        /*
        Local Variable
        */

        int distance = 10;


        /*
        Menampilkan nilai variabel
        */

        System.out.println("Speed: " + sepeda.speed);
        System.out.println("Number of Gears: " + Variabel.numGears);
        System.out.println("Distance: " + distance);
        System.out.println("Max Speed: " + MAX_SPEED);


        /*
        Memanggil method dengan parameter
        */

        sepeda.ride(50);

    }


    /*
    Method dengan Parameter
    */

    void ride(int newSpeed) {

        /*
        Local Variable di dalam method ride()
        */

        int time = 2;

        /*
        Mengubah nilai instance variable
        */

        speed = newSpeed;

        System.out.println("New Speed: " + speed);
        System.out.println("Time: " + time);

    }

}


/*
Aturan Penamaan Variabel di Java

1. Case Sensitive
speed berbeda dengan Speed

2. Harus diawali huruf
contoh benar:
speed
gearRatio

contoh tidak disarankan:
_speed
$money

3. Gunakan camelCase jika lebih dari satu kata
contoh:
currentSpeed
gearRatio

4. Tidak boleh menggunakan keyword Java
contoh salah:
int class = 10;

5. Constant menggunakan huruf besar semua
contoh:
MAX_SPEED
TOTAL_USER
*/