/*
Materi Java: Looping (Perulangan)

Sumber: Dokumentasi resmi Java (Oracle Java SE Documentation)

Looping digunakan untuk mengeksekusi blok kode berulang kali.
Ada tiga jenis loop utama di Java:
1. for
2. while
3. do-while

Tujuan penggunaan loop:
- Mengurangi duplikasi kode
- Mempermudah manipulasi data berulang
- Membuat program lebih efisien

Aturan umum:
- Loop dapat menggunakan tipe data numerik atau boolean untuk kondisi.
- Loop dapat dihentikan menggunakan 'break'.
- Lanjut ke iterasi berikutnya dengan 'continue'.

Cara compile dan run:
javac basic/06_pengulangan/Pengulangan01.java
java -cp basic/06_pengulangan Pengulangan01
*/

public class Pengulangan01 {

    /*
    For Loop
    Digunakan ketika jumlah iterasi diketahui.
    Sintaks: for(initialization; condition; update) { ... }
    */
    public void contohFor() {
        System.out.println("Contoh For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }
        System.out.println();
    }

    /*
    While Loop
    Digunakan ketika kondisi dicek sebelum blok dieksekusi.
    Sintaks: while(condition) { ... }
    */
    public void contohWhile() {
        System.out.println("Contoh While Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Hitung: " + count);
            count++;
        }
        System.out.println();
    }

    /*
    Do-While Loop
    Blok kode dijalankan minimal sekali, lalu kondisi dicek.
    Sintaks: do { ... } while(condition);
    */
    public void contohDoWhile() {
        System.out.println("Contoh Do-While Loop:");
        int num = 1;
        do {
            System.out.println("Angka: " + num);
            num++;
        } while (num <= 5);
        System.out.println();
    }

    public static void main(String[] args) {
        Pengulangan01 loop = new Pengulangan01();

        loop.contohFor();
        loop.contohWhile();
        loop.contohDoWhile();

        /* Tips dari dokumentasi resmi:
        1. Gunakan for loop untuk iterasi dengan jumlah tetap.
        2. Gunakan while loop untuk kondisi yang harus dicek sebelum eksekusi.
        3. Gunakan do-while loop untuk eksekusi minimal sekali.
        4. Gunakan break untuk keluar dari loop.
        5. Gunakan continue untuk melewati iterasi tertentu.
        */
    }
}