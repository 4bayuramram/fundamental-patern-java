/*
Jawaban Latihan Java: Looping (for, while, do-while)
File ini menjawab semua 10 soal dari SoalLoopingPemula.txt
Setiap jawaban disertai:
- Penjelasan syntax
- Pola cara menyelesaikan soal
- Output terminal
Tujuan: Membantu pemula memahami looping di Java

jalankan file : 
compile : 
javac basic/06_pengulangan/soal_dan_jawaban/01/Jawaban01.java
run : 
 java -cp basic/06_pengulangan/soal_dan_jawaban/01 Jawaban01
*/

public class Jawaban01 {

    public static void main(String[] args) {

        /*
        Soal 1:
        For loop dari 1 sampai 10.
        Penjelasan: for(initialization; condition; update) { ... }
        Output: 1 2 3 4 5 6 7 8 9 10
        */
        System.out.println("Soal 1: For loop 1-10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /*
        Soal 2:
        While loop untuk angka genap 2-20.
        Pola: gunakan increment +2 untuk hanya genap
        Output: 2 4 6 8 10 12 14 16 18 20
        */
        System.out.println("Soal 2: While loop angka genap 2-20");
        int w = 2;
        while (w <= 20) {
            System.out.print(w + " ");
            w += 2;
        }
        System.out.println("\n");

        /*
        Soal 3:
        Do-while loop angka ganjil 1-15.
        Pola: increment +2 mulai dari 1
        Output: 1 3 5 7 9 11 13 15
        */
        System.out.println("Soal 3: Do-While loop angka ganjil 1-15");
        int d = 1;
        do {
            System.out.print(d + " ");
            d += 2;
        } while (d <= 15);
        System.out.println("\n");

        /*
        Soal 4:
        For loop perkalian 5.
        Output: 5 10 15 20 25 30 35 40 45 50
        */
        System.out.println("Soal 4: For loop perkalian 5");
        for (int i = 1; i <= 10; i++) {
            System.out.print(5 * i + " ");
        }
        System.out.println("\n");

        /*
        Soal 5:
        While loop jumlah 1-100.
        Pola: jumlah += angka saat iterasi
        Output: 5050
        */
        System.out.println("Soal 5: While loop jumlah 1-100");
        int sum = 0;
        int num = 1;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("Jumlah: " + sum + "\n");

        /*
        Soal 6:
        Do-while loop input user positif sampai 0.
        Pola: gunakan Scanner untuk input, cek kondisi di while
        */
        /* Karena ini latihan non-interaktif, contoh menggunakan angka simulasi */
        System.out.println("Soal 6: Do-While simulasi input user");
        int[] inputs = {3, 7, 5, 0};
        int idx = 0;
        int input;
        do {
            input = inputs[idx];
            System.out.println("Input: " + input);
            idx++;
        } while (input != 0);
        System.out.println("Selesai input positif\n");

        /*
        Soal 7:
        For loop 1-10 dengan continue kecuali 5
        Output: 1 2 3 4 6 7 8 9 10
        */
        System.out.println("Soal 7: For loop 1-10 kecuali 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /*
        Soal 8:
        While loop 1-10 dengan break saat 7
        Output: 1 2 3 4 5 6
        */
        System.out.println("Soal 8: While loop berhenti di 7");
        int b = 1;
        while (b <= 10) {
            if (b == 7) break;
            System.out.print(b + " ");
            b++;
        }
        System.out.println("\n");

        /*
        Soal 9:
        For loop tabel perkalian 3 (1-10)
        Output: 3 6 9 12 15 18 21 24 27 30
        */
        System.out.println("Soal 9: For loop tabel perkalian 3");
        for (int i = 1; i <= 10; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println("\n");

        /*
        Soal 10:
        Gabungan for, while, do-while
        Output: 1-15 sesuai pola
        */
        System.out.println("Soal 10: Gabungan For, While, Do-While");
        System.out.print("For loop 1-5: ");
        for (int i = 1; i <= 5; i++) System.out.print(i + " ");
        System.out.println();

        System.out.print("While loop 6-10: ");
        int w2 = 6;
        while (w2 <= 10) { System.out.print(w2 + " "); w2++; }
        System.out.println();

        System.out.print("Do-While loop 11-15: ");
        int d2 = 11;
        do { System.out.print(d2 + " "); d2++; } while(d2 <= 15);
        System.out.println("\n");

        /*
        Kesimpulan:
        - Semua 10 soal berhasil dijawab.
        - Pemula belajar:
          1. Struktur dasar for, while, do-while
          2. Penggunaan break dan continue
          3. Pola increment untuk genap, ganjil, dan perkalian
          4. Bagaimana menggabungkan berbagai jenis loop
        - File ini bisa dijadikan referensi belajar looping di Java
        */
    }
}
