
 /*
  javac basic/02_operator/soal_dan_jawaban/01/Jawaban.java
  Java -cp basic/02_operator/soal_dan_jawaban/01 Jawaban
  */

public class Jawaban {

    public static void main(String[] args) {

        /*
        Soal 1
        Menghitung luas persegi panjang
        Rumus: panjang * lebar
        Operator * digunakan untuk perkalian
        */

        int panjang = 6;
        int lebar = 4;
        int luas = panjang * lebar;

        System.out.println("Luas = " + luas);


        /*
        Soal 2
        Mengecek apakah nilai lebih besar dari 70
        Operator > digunakan untuk perbandingan
        Hasilnya bertipe boolean (true atau false)
        */

        int nilai = 75;

        System.out.println(nilai > 70);


        /*
        Soal 3
        Mengecek kelulusan total
        Operator && berarti kedua kondisi harus true
        */

        boolean lulusTeori = true;
        boolean lulusPraktek = false;

        boolean lulusTotal = lulusTeori && lulusPraktek;

        System.out.println(lulusTotal);


        /*
        Soal 4
        Operator += digunakan untuk menambah nilai variabel
        stok += 5 artinya stok = stok + 5
        */

        int stok = 10;

        stok += 5;

        System.out.println(stok);


        /*
        Soal 5
        Operator ternary digunakan untuk membuat keputusan singkat
        Jika kondisi benar maka hasil kiri
        Jika salah maka hasil kanan
        */

        int umur = 17;

        String status = umur >= 17 ? "boleh membuat KTP" : "belum boleh";

        System.out.println(status);


        /*
        Soal 6
        Operator % digunakan untuk mencari sisa hasil bagi
        */

        int jumlah = 9;

        System.out.println(jumlah % 2);


        /*
        Soal 7
        Operator ++ menambah nilai variabel sebanyak 1
        */

        int counter = 1;

        counter++;

        System.out.println(counter);


        /*
        Soal 8
        Operator bitwise & membandingkan bit dari dua angka
        Digunakan pada operasi level biner
        */

        System.out.println(4 & 2);


        /*
        Soal 9
        instanceof digunakan untuk mengecek tipe data object
        Jika sesuai maka hasilnya true
        */

        Object data = "Belajar Java";

        System.out.println(data instanceof String);


        /*
        Soal 10
        Operator new digunakan untuk membuat object baru
        Object mobil dibuat dari class Object
        Lalu dicek apakah termasuk tipe Object
        */

        Object mobil = new Object();

        System.out.println(mobil instanceof Object);

    }
}