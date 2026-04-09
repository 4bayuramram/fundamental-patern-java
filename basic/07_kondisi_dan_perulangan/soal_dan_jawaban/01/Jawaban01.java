/*
File: Jawaban01.java

Materi: Conditional + Looping
Deskripsi: Jawaban dari 10 soal latihan yang diberikan sebelumnya.
Setiap soal dijawab dengan kode Java, disertai komentar penjelasan detail.
Komentar mencakup:
- Penjelasan sintaks
- Pola cara menyelesaikan soal
- Output yang diharapkan
Tujuan: Membantu pemula memahami Conditional & Looping di Java

compile : 
javac basic/07_kondisi_dan_perulangan/soal_dan_jawaban/01/Jawaban01.java
run : 
java -cp basic/07_kondisi_dan_perulangan/soal_dan_jawaban/01 Jawaban01
*/

public class Jawaban01 {

    public static void main(String[] args) {

        /*
        =====================================================
        Soal 1: Cek Angka Genap / Ganjil
        =====================================================
        */

        int angka1 = 7;
        /*
        Penjelasan:
        - Operator modulus % digunakan untuk mendapatkan sisa bagi
        - Jika angka % 2 == 0, maka angka genap
        - else artinya angka ganjil
        Output yang diharapkan:
        "Angka 7 adalah Ganjil"
        */
        if (angka1 % 2 == 0) {
            System.out.println("Angka " + angka1 + " adalah Genap");
        } else {
            System.out.println("Angka " + angka1 + " adalah Ganjil");
        }

        /*
        =====================================================
        Soal 2: Menentukan Grade Nilai
        =====================================================
        */

        int nilai = 85;
        /*
        Penjelasan:
        - Menggunakan if-else if-else berurutan untuk rentang nilai
        - Struktur if-else penting untuk memeriksa kondisi dari atas ke bawah
        Output:
        "Grade nilai 85 adalah B"
        */
        if (nilai >= 90) {
            System.out.println("Grade nilai " + nilai + " adalah A");
        } else if (nilai >= 80) {
            System.out.println("Grade nilai " + nilai + " adalah B");
        } else if (nilai >= 70) {
            System.out.println("Grade nilai " + nilai + " adalah C");
        } else {
            System.out.println("Grade nilai " + nilai + " adalah D");
        }

        /*
        =====================================================
        Soal 3: Menampilkan Nama Hari Menggunakan Switch
        =====================================================
        */

        int hari = 4;
        /*
        Penjelasan:
        - Switch digunakan untuk kondisi dengan nilai pasti
        - case menentukan kemungkinan nilai
        - break menghentikan switch agar tidak mengeksekusi case selanjutnya
        Output:
        "Hari ke-4 adalah Kamis"
        */
        switch (hari) {
            case 1:
                System.out.println("Hari ke-" + hari + " adalah Senin");
                break;
            case 2:
                System.out.println("Hari ke-" + hari + " adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ke-" + hari + " adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ke-" + hari + " adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ke-" + hari + " adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ke-" + hari + " adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-" + hari + " adalah Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }

        /*
        =====================================================
        Soal 4: Mencetak Angka 1 sampai 10 dengan For Loop
        =====================================================
        */

        /*
        Penjelasan:
        - For loop digunakan saat jumlah iterasi diketahui
        - Struktur: for(initialization; condition; increment)
        Output:
        1 2 3 4 5 6 7 8 9 10
        */
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
        =====================================================
        Soal 5: Mencetak Angka 10 ke 1 dengan While Loop
        =====================================================
        */

        int i = 10;
        /*
        Penjelasan:
        - While loop digunakan saat kondisi dinamis
        - Loop terus berjalan selama kondisi true
        Output:
        10 9 8 7 6 5 4 3 2 1
        */
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        /*
        =====================================================
        Soal 6: Mencetak Angka 1 sampai 5 dengan Do-While
        =====================================================
        */

        int j = 1;
        /*
        Penjelasan:
        - Do-while dijalankan minimal 1 kali
        - Struktur: do { ... } while(condition)
        Output:
        1 2 3 4 5
        */
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println();

        /*
        =====================================================
        Soal 7: Menampilkan isi Array menggunakan Enhanced For
        =====================================================
        */

        int[] angkaArray = {2, 4, 6, 8};
        /*
        Penjelasan:
        - Enhanced for / for-each digunakan untuk array atau collection
        - Syntax: for(type var : array)
        Output:
        2 4 6 8
        */
        for (int a : angkaArray) {
            System.out.print(a + " ");
        }
        System.out.println();

        /*
        =====================================================
        Soal 8: Mencetak angka 1 sampai 10, skip 5 menggunakan Continue
        =====================================================
        */

        /*
        Penjelasan:
        - Continue melewati iterasi saat kondisi terpenuhi
        - Loop tetap berlanjut ke iterasi berikutnya
        Output:
        1 2 3 4 6 7 8 9 10
        */
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        /*
        =====================================================
        Soal 9: Mencetak angka 1 sampai 10, berhenti di 7 menggunakan Break
        =====================================================
        */

        /*
        Penjelasan:
        - Break menghentikan loop saat kondisi terpenuhi
        - Loop berhenti, kode setelah break tetap berjalan
        Output:
        1 2 3 4 5 6
        */
        for (int k = 1; k <= 10; k++) {
            if (k == 7) {
                break;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        /*
        =====================================================
        Soal 10: Ternary Operator untuk Positif / Negatif
        =====================================================
        */

        int angka2 = -8;
        /*
        Penjelasan:
        - Ternary operator: condition ? valueIfTrue : valueIfFalse
        - Digunakan untuk if sederhana dalam satu baris
        Output:
        "Angka -8 adalah Negatif"
        */
        String hasil = (angka2 >= 0) ? "Positif" : "Negatif";
        System.out.println("Angka " + angka2 + " adalah " + hasil);

        /*
        =====================================================
        Kesimpulan:
        =====================================================
        - 10 soal berhasil dijawab menggunakan Conditional dan Looping
        - Pemula bisa memahami:
          1. Struktur if-else
          2. Switch-case
          3. Ternary operator
          4. Looping: for, while, do-while, for-each
          5. Control: break dan continue
        - Komentar memberikan penjelasan sintaks, pola berpikir, dan output
        - File ini bisa dijadikan referensi latihan dan panduan belajar
        */
    }

}