/*
Jawaban Latihan Java: Array - Pemula
File: Jawaban01.java

File ini berisi jawaban lengkap untuk 10 soal latihan Array. 
Setiap soal dijawab dengan kode Java yang bisa dijalankan langsung, 
dilengkapi dengan komentar untuk menjelaskan sintaks, logika, dan cara penyelesaian. 
Output yang dihasilkan juga dicantumkan di komentar untuk memudahkan pemula belajar.

Cara compile dan run:

compile : javac basic/09_array/soal_dan_jawaban/01/Jawaban01.java
run : java -cp basic/09_array/soal_dan_jawaban/01 Jawaban01
*/

public class Jawaban01 {

    public static void main(String[] args) {

        /*******************************************************
         * SOAL 1:
         * Buat array integer "angka" dengan 5 elemen: 10,20,30,40,50
         * Tampilkan semua elemen menggunakan loop for biasa
         *******************************************************/
        System.out.println("SOAL 1:");
        int[] angka = {10, 20, 30, 40, 50}; // deklarasi dan inisialisasi array
        // Loop for digunakan untuk mengakses setiap indeks array
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + ": " + angka[i]);
        }
        /*
        Output:
        Index 0: 10
        Index 1: 20
        Index 2: 30
        Index 3: 40
        Index 4: 50
        */

        /*******************************************************
         * SOAL 2:
         * Array string "buah" = {"apel", "jeruk", "mangga"}
         * Tampilkan elemen kedua
         *******************************************************/
        System.out.println("\nSOAL 2:");
        String[] buah = {"apel", "jeruk", "mangga"};
        // Indeks kedua adalah 1 karena array dimulai dari 0
        System.out.println("Elemen kedua: " + buah[1]);
        /*
        Output:
        Elemen kedua: jeruk
        */

        /*******************************************************
         * SOAL 3:
         * Array integer "nilai" dengan 4 elemen
         * Isi elemen ke-3 dengan 75, tampilkan elemen ke-3
         *******************************************************/
        System.out.println("\nSOAL 3:");
        int[] nilai = new int[4]; // semua elemen default 0
        nilai[2] = 75; // mengubah elemen ke-3 (indeks 2)
        System.out.println("Elemen ke-3: " + nilai[2]);
        /*
        Output:
        Elemen ke-3: 75
        */

        /*******************************************************
         * SOAL 4:
         * Array double "harga" = {1000.5, 2500.75, 3000.0}
         * Tampilkan semua elemen menggunakan for-each loop
         *******************************************************/
        System.out.println("\nSOAL 4:");
        double[] harga = {1000.5, 2500.75, 3000.0};
        for (double h : harga) { // for-each otomatis mengambil tiap elemen
            System.out.println(h);
        }
        /*
        Output:
        1000.5
        2500.75
        3000.0
        */

        /*******************************************************
         * SOAL 5:
         * Array 2D integer 3x3 "matrix" dengan angka 1-9
         * Tampilkan seluruh matrix menggunakan nested loop
         *******************************************************/
        System.out.println("\nSOAL 5:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        /*
        Output:
        1 2 3 
        4 5 6 
        7 8 9
        */

        /*******************************************************
         * SOAL 6:
         * Array char "huruf" = {'A','B','C','D'}
         * Ubah elemen ke-2 menjadi 'Z' dan tampilkan seluruh array
         *******************************************************/
        System.out.println("\nSOAL 6:");
        char[] huruf = {'A', 'B', 'C', 'D'};
        huruf[1] = 'Z'; // ubah indeks ke-1
        for (int i = 0; i < huruf.length; i++) {
            System.out.print(huruf[i] + " ");
        }
        System.out.println();
        /*
        Output:
        A Z C D
        */

        /*******************************************************
         * SOAL 7:
         * Array boolean "status" = {true, false, true}
         * Tampilkan panjang array
         *******************************************************/
        System.out.println("\nSOAL 7:");
        boolean[] status = {true, false, true};
        // property length memberi panjang array
        System.out.println("Panjang array: " + status.length);
        /*
        Output:
        Panjang array: 3
        */

        /*******************************************************
         * SOAL 8:
         * Array string "hari" = nama hari seminggu
         * Tampilkan elemen terakhir
         *******************************************************/
        System.out.println("\nSOAL 8:");
        String[] hari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        // elemen terakhir = indeks length-1
        System.out.println("Hari terakhir: " + hari[hari.length - 1]);
        /*
        Output:
        Hari terakhir: Minggu
        */

        /*******************************************************
         * SOAL 9:
         * Array integer "numbers" 5 elemen
         * Hitung dan tampilkan jumlah semua elemen
         *******************************************************/
        System.out.println("\nSOAL 9:");
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0; // variabel untuk jumlah
        for (int n : numbers) {
            sum += n; // tambahkan tiap elemen ke sum
        }
        System.out.println("Jumlah semua elemen: " + sum);
        /*
        Output:
        Jumlah semua elemen: 75
        */

        /*******************************************************
         * SOAL 10:
         * Array 2D integer "tabel" 2x3
         * Ubah elemen baris pertama kolom kedua menjadi 99
         * Tampilkan seluruh tabel
         *******************************************************/
        System.out.println("\nSOAL 10:");
        int[][] tabel = {
            {1, 2, 3},
            {4, 5, 6}
        };
        tabel[0][1] = 99; // ubah indeks [0][1]
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[i].length; j++) {
                System.out.print(tabel[i][j] + " ");
            }
            System.out.println();
        }
        /*
        Output:
        1 99 3
        4 5 6
        */
        
        /*******************************************************
         * KESIMPULAN
         * - Semua 10 soal berhasil dijawab menggunakan array.
         * - Pemula belajar:
         *   1. Deklarasi & inisialisasi array (1D & 2D)
         *   2. Mengakses elemen dengan indeks
         *   3. Looping: for biasa & for-each
         *   4. Mengubah elemen array
         *   5. Menggunakan properti length
         * - File ini membantu pemula memahami array dan pola pemecahan soal.
         *******************************************************/
    }
}