/*
Materi Java: Array

/*
Penjelasan dasar tentang Array di Java

Array adalah struktur data yang digunakan untuk menyimpan sekumpulan nilai dengan tipe yang sama.
Setiap nilai dalam array disebut elemen.
Indeks array dimulai dari 0.

Contoh:
int[] numbers = {10, 20, 30, 40};

int[] = tipe array integer
numbers = nama array
{10, 20, 30, 40} = elemen array

Java adalah bahasa pemrograman bertipe statis, jadi tipe data array harus ditentukan saat deklarasi.
*/

/*
File ini menjelaskan:
1. Deklarasi dan Inisialisasi Array
2. Mengakses Elemen Array
3. Array Multidimensi
4. Perulangan untuk Array
5. Array Length
6. Aturan Praktik Baik Array

Semua contoh bisa langsung dijalankan.

Cara compile dan run:

javac basic/09_array/Array01.java
java -cp basic/09_array Array01
*/

public class Array01 {

    /*
    Deklarasi dan Inisialisasi Array
    */

    // Array integer dengan 5 elemen
    int[] numbers = new int[5]; // inisialisasi default semua 0

    // Array dengan inisialisasi langsung
    int[] scores = {90, 80, 70, 60, 50};

    /*
    Method utama program Java
    */
    public static void main(String[] args) {

        // Membuat object dari class Array01
        Array01 example = new Array01();

        /*
        Mengisi array numbers
        */
        example.numbers[0] = 10;
        example.numbers[1] = 20;
        example.numbers[2] = 30;
        example.numbers[3] = 40;
        example.numbers[4] = 50;

        /*
        Mengakses elemen array
        */
        System.out.println("Numbers Array:");
        System.out.println("Index 0: " + example.numbers[0]);
        System.out.println("Index 3: " + example.numbers[3]);

        /*
        Array dengan inisialisasi langsung
        */
        System.out.println("\nScores Array:");
        for (int i = 0; i < example.scores.length; i++) {
            System.out.println("Index " + i + ": " + example.scores[i]);
        }

        /*
        Array Multidimensi
        */
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nMatrix 2D:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        /*
        Menggunakan enhanced for loop (for-each) untuk array
        */
        System.out.println("\nScores Array (for-each loop):");
        for (int score : example.scores) {
            System.out.println(score);
        }

        /*
        Panjang array
        */
        System.out.println("\nLength of numbers array: " + example.numbers.length);
        System.out.println("Length of matrix rows: " + matrix.length);
        System.out.println("Length of matrix columns: " + matrix[0].length);
    }
}

/*
Aturan Praktik Baik Menggunakan Array di Java

1. Gunakan tipe data yang sesuai dengan elemen array
   contoh: int[], double[], String[]

2. Jangan mencoba mengakses indeks di luar batas array
   contoh salah:
   int[] arr = {1, 2, 3};
   System.out.println(arr[5]); // Error: ArrayIndexOutOfBoundsException

3. Gunakan length untuk mengetahui panjang array
   contoh:
   for (int i = 0; i < arr.length; i++) { ... }

4. Untuk array multidimensi, periksa panjang tiap dimensi sebelum mengakses

5. Gunakan for-each loop untuk iterasi jika tidak perlu indeks

6. Untuk konstanta array, bisa menggunakan final
   contoh:
   final int[] DAYS = {1, 2, 3, 4, 5, 6, 7};
*/