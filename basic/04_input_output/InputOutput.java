/*
Materi Java: Input/Output (Scanner & System.out)
Berdasarkan gaya dan kelengkapan Java Documentation (Oracle)
https://docs.oracle.com/javase/

================================================================
PENDAHULUAN I/O DI JAVA
================================================================

I/O (Input/Output) adalah mekanisme untuk:
- Mengambil data dari pengguna (keyboard)
- Menampilkan informasi ke layar (console)

Java menyediakan dua bagian utama untuk I/O dasar:
1. System.out → Output stream standar (console)
2. java.util.Scanner → Input reader untuk berbagai tipe data


================================================================
OUTPUT DENGAN System.out
================================================================

System.out adalah instance dari PrintStream.
Digunakan untuk mencetak teks ke output standar.

Metode yang umum digunakan:
- println() → mencetak teks + baris baru
- print()   → mencetak teks tanpa baris baru
- printf()  → mencetak teks dengan format


Contoh:
System.out.println("Halo");
System.out.print("Masukkan nama: ");
System.out.printf("Nilai: %d\n", 10);

================================================================
INPUT DENGAN Scanner
================================================================

Scanner digunakan untuk membaca data dari input stream.

Deklarasi:
Scanner scanner = new Scanner(System.in);

Metode penting:
- nextLine()   → membaca teks satu baris
- next()       → membaca satu kata
- nextInt()    → membaca integer
- nextDouble() → membaca desimal
- nextBoolean()→ membaca boolean (true/false)

Scanner bekerja berdasarkan token (bagian teks yang dipisahkan spasi).
Scanner harus ditutup setelah selesai digunakan:
scanner.close();

================================================================
JENIS DATA YANG DIBACA SCANNER
================================================================

1. String
   nextLine() membaca 1 baris lengkap.
   next() membaca 1 kata pertama.

2. Integer
   nextInt() → membaca angka bulat.
   Jika input bukan angka, terjadi InputMismatchException.

3. Double
   nextDouble() membaca angka desimal.

4. Boolean
   nextBoolean() menerima:
   - true
   - false

================================================================
PENANGANAN ERROR INPUT
================================================================

Jika pengguna memasukkan format yang salah,
Scanner dapat melemparkan InputMismatchException.

Cara aman:
- Cek dengan scanner.hasNextInt()
- Cek dengan scanner.hasNextDouble()


Contoh:
if (scanner.hasNextInt()) {
    umur = scanner.nextInt();
} else {
    System.out.println("Input tidak valid!");
}

menjalankan 
javac -encoding UTF-8 basic/04_input_output/InputOutput.java
java -cp basic/04_input_output InputOutput
================================================================
CONTOH PROGRAM INTERAKTIF LENGKAP
================================================================
*/

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        System.out.println("=== Program Input/Output Java ===");

        // Membuat Scanner untuk input keyboard
        Scanner scanner = new Scanner(System.in);

        /*
        Membaca String
        nextLine() digunakan agar teks lengkap terbaca.
        */
        System.out.print("Masukkan nama lengkap: ");
        String nama = scanner.nextLine();


        /*
        Membaca Integer
        Pastikan input adalah angka valid.
        */
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();


        /*
        Membaca Double
        nextDouble() membaca format angka desimal.
        */
        System.out.print("Masukkan tinggi badan (mis: 165.5): ");
        double tinggi = scanner.nextDouble();


        /*
        Menampilkan hasil
        */
        System.out.println("\n=== HASIL INPUT ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Tinggi : " + tinggi);

        /*
        Menutup scanner
        */
        scanner.close();

        System.out.println("\nProgram selesai.");
    }
}


/*
================================================================
CATATAN PENTING SESUAI DOKUMENTASI RESMI JAVA
================================================================

1. Scanner adalah bagian dari paket java.util.
   Wajib ditulis:
   import java.util.Scanner;

2. System.out adalah instance PrintStream yang terhubung
   ke output standar (console).

3. InputMismatchException terjadi jika tipe input tidak sesuai
   dengan metode pembaca (misalnya nextInt membaca teks).

4. nextLine() sering digunakan setelah nextInt/nextDouble
   karena sisa newline perlu dibersihkan.

5. Menggunakan Scanner pada System.in sebaiknya ditutup hanya
   di akhir program utama untuk mencegah penutupan input stream global.

================================================================
REFERENSI UTAMA:
- Java SE Documentation (Oracle)
  * Scanner Class Docs
  * PrintStream Docs (System.out)
  * Basic I/O Documentation
================================================================
*/
