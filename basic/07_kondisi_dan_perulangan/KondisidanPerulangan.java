/*
Materi Java: Conditional + Looping (Percabangan & Perulangan)

/*
Penjelasan berdasarkan dokumentasi resmi Java (Oracle)

Conditional digunakan untuk pengambilan keputusan.
Looping digunakan untuk menjalankan kode secara berulang.

Struktur ini adalah dasar dari hampir semua program Java.
*/

/*
File ini menjelaskan:
1. If, Else If, Else
2. Switch
3. Ternary Operator
4. For Loop
5. While Loop
6. Do-While Loop
7. Enhanced For (For-Each)
8. Break & Continue


compile :
javac basic/07_kondisi_dan_perulangan/KondisidanPerulangan.java
run :
 java -cp basic/07_kondisi_dan_perulangan KondisidanPerulangan

*/

public class KondisidanPerulangan {

    /*
    Instance Variable
    */
    int nilai = 75;

    /*
    Class Variable
    */
    static String kategori = "Belajar Java";

    /*
    Method utama
    */
    public static void main(String[] args) {

        KondisidanPerulangan obj = new KondisidanPerulangan();

        /*
        =========================================
        1. IF, ELSE IF, ELSE
        =========================================
        */

        if (obj.nilai >= 90) {
            System.out.println("Grade A");
        } else if (obj.nilai >= 80) {
            System.out.println("Grade B");
        } else if (obj.nilai >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Tidak Lulus");
        }


        /*
        =========================================
        2. SWITCH
        =========================================
        */

        int hari = 2;

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }


        /*
        =========================================
        3. TERNARY OPERATOR
        =========================================
        */

        int umur = 18;
        String status = (umur >= 17) ? "Dewasa" : "Anak-anak";
        System.out.println(status);


        /*
        =========================================
        4. FOR LOOP
        =========================================
        */

        for (int i = 0; i < 3; i++) {
            System.out.println("For ke-" + i);
        }


        /*
        =========================================
        5. WHILE LOOP
        =========================================
        */

        int i = 0;
        while (i < 3) {
            System.out.println("While ke-" + i);
            i++;
        }


        /*
        =========================================
        6. DO-WHILE LOOP
        =========================================
        */

        int j = 0;
        do {
            System.out.println("Do-While ke-" + j);
            j++;
        } while (j < 3);


        /*
        =========================================
        7. ENHANCED FOR (FOR-EACH)
        =========================================
        */

        int[] angka = {1, 2, 3};

        for (int a : angka) {
            System.out.println("Nilai: " + a);
        }


        /*
        =========================================
        8. BREAK & CONTINUE
        =========================================
        */

        for (int k = 0; k < 5; k++) {

            if (k == 2) {
                continue;
            }

            if (k == 4) {
                break;
            }

            System.out.println("k = " + k);
        }


        /*
        Memanggil method
        */
        obj.contohMethod(5);
    }


    /*
    Method dengan parameter
    */
    void contohMethod(int batas) {

        int count = 0;

        while (count < batas) {
            System.out.println("Loop dari method: " + count);
            count++;
        }

    }

}


/*
=====================================================
Aturan & Catatan Penting
=====================================================

1. IF digunakan untuk kondisi boolean (true/false)
2. SWITCH cocok untuk nilai tetap (int, char, String, enum)
3. Ternary hanya untuk kondisi sederhana
4. FOR digunakan jika jumlah iterasi diketahui
5. WHILE digunakan jika kondisi dinamis
6. DO-WHILE minimal dijalankan sekali
7. FOR-EACH digunakan untuk array/collection
8. break menghentikan loop
9. continue melewati iterasi tertentu

=====================================================
*/