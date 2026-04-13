/*
Materi Java: Object dan Class
Berdasarkan gaya dan kelengkapan Java Documentation (Oracle)
https://docs.oracle.com/javase/

================================================================
PENDAHULUAN OBJECT & CLASS
================================================================

Dalam Java, Object dan Class adalah fondasi utama dari
Object-Oriented Programming (OOP).

- Object → objek nyata (instance)
- Class  → blueprint / cetakan dari object

Urutan konsep:
Class dibuat terlebih dahulu → lalu Object dibuat dari Class tersebut

================================================================
PENGERTIAN OBJECT
================================================================

Object adalah representasi nyata dari suatu class.

Object memiliki:
- State (data / atribut)
- Behavior (method / aksi)

Contoh:
Object:
- Andi (Mahasiswa)
- Budi (Mahasiswa)

================================================================
PENGERTIAN CLASS
================================================================

Class adalah blueprint untuk membuat object.

Class berisi:
1. Atribut (field)
2. Method (fungsi)
3. Constructor

Struktur:

class NamaClass {
    // atribut
    // constructor
    // method
}

================================================================
HUBUNGAN OBJECT DAN CLASS
================================================================

Class → cetakan
Object → hasil cetakan

Contoh:
Class: Mahasiswa
Object:
- mahasiswa1
- mahasiswa2

================================================================
MEMBUAT OBJECT
================================================================

Sintaks:
NamaClass namaObject = new NamaClass();

Contoh:
Mahasiswa mhs = new Mahasiswa();

Keyword:
- new → membuat object baru di memory

================================================================
CONTOH PROGRAM INTERAKTIF LENGKAP
================================================================
*/

import java.util.Scanner;

/*
================================================================
CLASS (BLUEPRINT)
================================================================
*/
class Mahasiswa {

    /*
    ============================================================
    ATRIBUT / FIELD
    ============================================================
    */
    String nama;
    int umur;
    String jurusan;

    /*
    ============================================================
    CONSTRUCTOR
    ============================================================
    */
    Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    /*
    ============================================================
    METHOD / BEHAVIOR
    ============================================================
    */
    void tampilkanInfo() {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama     : " + nama);
        System.out.println("Umur     : " + umur);
        System.out.println("Jurusan  : " + jurusan);
    }

    void belajar() {
        System.out.println(nama + " sedang belajar Java...");
    }
}

/*
================================================================
CLASS UTAMA (MAIN PROGRAM)
================================================================
*/
public class ObjectdanClass {

    public static void main(String[] args) {

        System.out.println("=== Program Object dan Class Java ===");

        Scanner scanner = new Scanner(System.in);

        /*
        ============================================================
        INPUT USER
        ============================================================
        */
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        System.out.print("Masukkan jurusan: ");
        String jurusan = scanner.nextLine();

        /*
        ============================================================
        MEMBUAT OBJECT DARI CLASS
        ============================================================
        */
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, umur, jurusan);

        /*
        ============================================================
        MENGGUNAKAN OBJECT
        ============================================================
        */
        mahasiswa1.tampilkanInfo();
        mahasiswa1.belajar();

        /*
        ============================================================
        OBJECT TAMBAHAN (CONTOH)
        ============================================================
        */
        Mahasiswa mahasiswa2 = new Mahasiswa("Siti", 21, "Informatika");

        mahasiswa2.tampilkanInfo();
        mahasiswa2.belajar();

        /*
        ============================================================
        MENUTUP SCANNER
        ============================================================
        */
        scanner.close();

        System.out.println("\nProgram selesai.");
    }
}

/*
================================================================
CATATAN PENTING SESUAI DOKUMENTASI RESMI JAVA
================================================================

1. Class adalah blueprint untuk membuat object.

2. Object adalah instance dari class.

3. Keyword "new" digunakan untuk membuat object.

4. Constructor dipanggil otomatis saat object dibuat.

5. this digunakan untuk mengakses atribut milik object saat ini.

6. Method digunakan untuk mendefinisikan perilaku object.

7. Satu file Java hanya boleh memiliki satu public class
   dengan nama yang sama dengan file:
   ObjectdanClass.java

================================================================
KESIMPULAN
================================================================

- Object = hasil nyata
- Class = cetakan
- Object dibuat dari Class
- Object memiliki data dan perilaku

================================================================
REFERENSI UTAMA:
- Java SE Documentation (Oracle)
  * Classes and Objects
  * Defining Methods
  * Creating Objects
================================================================
*/