import java.util.Scanner;

public class Jawaban {

    /*
    Penjelasan:
    File ini berisi jawaban 10 soal latihan Input/Output di Java.
    Setiap soal dibuat dalam method terpisah agar rapi dan mudah dipelajari.
    Method main menyediakan menu untuk mencoba setiap jawaban.

    jalankan 
    javac -encoding UTF-8 basic/04_input_output/soal_dan_jawaban/01/Jawaban.java
    Java -cp basic/04_input_output/soal_dan_jawaban/01 Jawaban
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih nomor soal (1-10): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        if (pilihan == 1) soal1(scanner);
        if (pilihan == 2) soal2(scanner);
        if (pilihan == 3) soal3(scanner);
        if (pilihan == 4) soal4(scanner);
        if (pilihan == 5) soal5(scanner);
        if (pilihan == 6) soal6(scanner);
        if (pilihan == 7) soal7(scanner);
        if (pilihan == 8) soal8(scanner);
        if (pilihan == 9) soal9(scanner);
        if (pilihan == 10) soal10(scanner);

        scanner.close();
    }

    /*  
    Soal 1:
    Buat program yang meminta pengguna memasukkan nama,
    lalu menampilkan teks: "Halo, [nama]!"
    */
    static void soal1(Scanner scanner) {
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine(); // membaca 1 baris nama
        System.out.println("Halo, " + nama + "!");
    }

    /*
    Soal 2:
    Membaca dua angka menggunakan Scanner,
    lalu menampilkan hasil penjumlahannya.
    */
    static void soal2(Scanner scanner) {
        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        int hasil = a + b; // penjumlahan
        System.out.println("Hasil: " + hasil);
    }

    /*
    Soal 3:
    Membaca umur (int).
    Jika input bukan angka → tampilkan error.
    */
    static void soal3(Scanner scanner) {

        System.out.print("Masukkan umur: ");

        if (scanner.hasNextInt()) { 
            int umur = scanner.nextInt();
            System.out.println("Umur Anda: " + umur);
        } else {
            System.out.println("Input tidak valid!");
        }
    }

    /*
    Soal 4:
    Membaca tinggi badan (double)
    lalu menampilkan kembali.
    */
    static void soal4(Scanner scanner) {
        System.out.print("Masukkan tinggi badan: ");
        double tinggi = scanner.nextDouble();
        System.out.println("Tinggi Anda: " + tinggi + " cm");
    }

    /*
    Soal 5:
    Membaca satu kata dengan next() dan menampilkan panjangnya.
    */
    static void soal5(Scanner scanner) {
        System.out.print("Masukkan satu kata: ");
        String kata = scanner.next(); // membaca satu kata
        System.out.println("Panjang kata: " + kata.length());
    }

    /*
    Soal 6:
    Membaca nama (String), umur (int), status pelajar (boolean)
    lalu menampilkan semua.
    */
    static void soal6(Scanner scanner) {

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        System.out.print("Apakah Anda pelajar? (true/false): ");
        boolean status = scanner.nextBoolean();

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Pelajar: " + status);
    }

    /*
    Soal 7:
    Menginput harga dan jumlah barang,
    lalu menghitung total bayar.
    */
    static void soal7(Scanner scanner) {

        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();

        double total = harga * jumlah; // perhitungan total

        System.out.println("Total bayar: " + total);
    }

    /*
    Soal 8:
    Menampilkan format angka dua digit desimal dengan printf.
    */
    static void soal8(Scanner scanner) {
        double nilai = 90.5;

        System.out.printf("Nilai ujian: %.2f\n", nilai);
    }

    /*
    Soal 9:
    Mengecek apakah input berupa angka bulat menggunakan hasNextInt().
    */
    static void soal9(Scanner scanner) {

        System.out.print("Masukkan angka bulat: ");

        if (scanner.hasNextInt()) {
            int angka = scanner.nextInt();
            System.out.println("Anda memasukkan angka: " + angka);
        } else {
            System.out.println("Input bukan angka bulat!");
        }
    }

    /*
    Soal 10:
    Membaca satu baris kalimat
    lalu menghitung jumlah karakter.
    */
    static void soal10(Scanner scanner) {

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        int jumlah = kalimat.length(); // hitung karakter

        System.out.println("Jumlah karakter: " + jumlah);
    }
}