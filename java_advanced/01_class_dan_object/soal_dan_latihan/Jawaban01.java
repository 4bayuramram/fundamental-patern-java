/*
==============================================================
FILE: Jawaban01.java
MATERI: Class, Object, dan Instance
==============================================================

File ini berisi jawaban dari 5 soal latihan:
- Setiap soal memiliki:
  ✔ Penjelasan konsep
  ✔ Penjelasan syntax
  ✔ Pola berpikir penyelesaian
  ✔ Contoh output

Tujuan:
Agar pemula bisa BELAJAR dari komentar, bukan hanya melihat kode.

==============================================================
*/

import java.util.Scanner;

/*
==============================================================
SOAL 1
==============================================================

Buat class Mobil dengan atribut:
- merk
- tahun

==============================================================
PENJELASAN:
- Class = blueprint
- Object = instance dari class
- Kita isi data secara manual

POLA BERPIKIR:
1. Buat class
2. Tambahkan atribut
3. Buat object
4. Isi data
5. Tampilkan

==============================================================
*/
class Mobil {
    String merk;
    int tahun;
}

/*
==============================================================
SOAL 2
==============================================================

Class Mahasiswa dengan method tampilkanData()

==============================================================
PENJELASAN:
Method adalah perilaku dari object

==============================================================
*/
class Mahasiswa {
    String nama;
    int umur;

    void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}

/*
==============================================================
SOAL 3
==============================================================

Class Persegi dengan method hitungLuas()

==============================================================
PENJELASAN:
Method bisa mengembalikan nilai (return)

==============================================================
*/
class Persegi {
    int sisi;

    int hitungLuas() {
        return sisi * sisi;
    }
}

/*
==============================================================
SOAL 4
==============================================================

Class Buku dengan constructor

==============================================================
PENJELASAN:
Constructor digunakan untuk langsung mengisi data saat object dibuat

==============================================================
*/
class Buku {
    String judul;
    String penulis;

    // constructor
    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

/*
==============================================================
SOAL 5
==============================================================

Class Siswa + Scanner + logika kelulusan

==============================================================
PENJELASAN:
- Scanner untuk input user
- if digunakan untuk logika

==============================================================
*/
class Siswa {
    String nama;
    int nilai;

    void cekKelulusan() {
        if (nilai >= 75) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }
}

/*
==============================================================
CLASS UTAMA
==============================================================
*/
public class Jawaban01 {

    public static void main(String[] args) {

        System.out.println("=== JAWABAN LATIHAN JAVA ===\n");

        /*
        ======================================================
        JAWABAN SOAL 1
        ======================================================
        */
        System.out.println("SOAL 1:");

        Mobil mobil1 = new Mobil(); // membuat object
        mobil1.merk = "Toyota";     // isi data
        mobil1.tahun = 2022;

        System.out.println("Merk  : " + mobil1.merk);
        System.out.println("Tahun : " + mobil1.tahun);

        /*
        OUTPUT:
        Merk  : Toyota
        Tahun : 2022
        */

        /*
        ======================================================
        JAWABAN SOAL 2
        ======================================================
        */
        System.out.println("\nSOAL 2:");

        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Andi";
        m1.umur = 20;

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Budi";
        m2.umur = 22;

        m1.tampilkanData();
        m2.tampilkanData();

        /*
        OUTPUT:
        Nama : Andi
        Umur : 20
        Nama : Budi
        Umur : 22
        */

        /*
        ======================================================
        JAWABAN SOAL 3
        ======================================================
        */
        System.out.println("\nSOAL 3:");

        Persegi p = new Persegi();
        p.sisi = 5;

        int luas = p.hitungLuas();

        System.out.println("Luas Persegi: " + luas);

        /*
        OUTPUT:
        Luas Persegi: 25
        */

        /*
        ======================================================
        JAWABAN SOAL 4
        ======================================================
        */
        System.out.println("\nSOAL 4:");

        Buku b1 = new Buku("Java Dasar", "Andi");
        Buku b2 = new Buku("OOP Java", "Budi");

        System.out.println("Judul: " + b1.judul + ", Penulis: " + b1.penulis);
        System.out.println("Judul: " + b2.judul + ", Penulis: " + b2.penulis);

        /*
        OUTPUT:
        Judul: Java Dasar, Penulis: Andi
        Judul: OOP Java, Penulis: Budi
        */

        /*
        ======================================================
        JAWABAN SOAL 5
        ======================================================
        */
        System.out.println("\nSOAL 5:");

        Scanner scanner = new Scanner(System.in);

        Siswa siswa = new Siswa();

        System.out.print("Masukkan nama: ");
        siswa.nama = scanner.nextLine();

        System.out.print("Masukkan nilai: ");
        siswa.nilai = scanner.nextInt();

        siswa.cekKelulusan();

        /*
        CONTOH OUTPUT:
        Masukkan nama: Andi
        Masukkan nilai: 80
        Status: Lulus
        */

        scanner.close();

        /*
        ======================================================
        KESIMPULAN
        ======================================================

        Dari latihan ini kita belajar:

        1. Class adalah blueprint
        2. Object adalah instance dari class
        3. Atribut menyimpan data
        4. Method menjalankan aksi
        5. Constructor mempermudah inisialisasi
        6. Scanner digunakan untuk input
        7. Logika if digunakan untuk pengambilan keputusan

        POLA UMUM MENYELESAIKAN SOAL OOP:
        1. Tentukan class
        2. Tentukan atribut
        3. Tentukan method
        4. Buat object
        5. Gunakan object

        Jika kamu paham file ini, maka kamu sudah menguasai
        dasar OOP di Java 👍

        ======================================================
        */
    }
}