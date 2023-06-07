package Tugas_Wenna_versi2;

import java.util.Scanner;

public class tugasversi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int starts,ends,countganjil, countgenap;

        System.out.println("Menampilkan Deret Bilangan Prima");
        System.out.print("Masukkan rentang awal : "); // melakukan input rentang awal dari bilangan
        starts=input.nextInt();
        System.out.print("Masukkan rentang akhir : "); // melakukan input rentang akhir dari bilangan
        ends=input.nextInt();
        System.out.println("----------------------------------------------");

        System.out.print("Deret Bilangan Prima dari " + starts + " - " + ends + " adalah ");

        // perulangan for dari nilai awal pada variabel pertama dan akan berhenti pada variabel akhir
        // selama kondisi i belum terpenuhi, maka i akan terus ditambah value 1
        for (int i = starts; i < ends; i++) {
            boolean isPrima = true; // di inisiasi bahwa isPrima adalah True, dan akan di validasi lagi pada proses berikutnya apakah isPrima tetap true atau false

            // nilai j akan dimulai dari 2 karena bilangan prima dimulai dari 2, sehingga angka 1 sudah pasti tidak akan di proses
            // Apabila kondisi nilai j kurang dari i masih belum terpenuhi, maka j akan terus ditambah value 1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // jika nilai i mod j hasilnya 0, maka status isPrima akan menjadi false dan akan dilakukan break
                    isPrima = false;
                    break;
                }
            }
            // sebelum bilangan akhirnya dianggap prima, akan dilakukan validasi lagi apakah status bilangan tersebut masih true atau false
            // jika masih true maka akan dilakukan print
            if (isPrima == true) {
                if (i == 0 || i == 1) {
                    continue; // move to next iteration
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();

        // Perhitungan Ganjil
        System.out.println();
        System.out.print("Bilangan Prima ganjil antara " + starts + " - " + ends + " adalah ");
        countganjil=0; // count untuk menyimpan hasil looping bilangan prima ganjil yang ditemukan agar dapat melihat berapa banyak bilangan prima ganjil yang ditemukan
        for (int i = starts; i < ends; i++) {
            boolean isPrima = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            // jika bilangan prima berstatus true, maka akan di cek kembali apakah bilangan tersebut bernilai 0 atau 1
            if (isPrima == true) {
                if (i == 0 || i == 1) {
                    continue; // move to next iteration
                } else {
                    // jika bilangan tersebut di mod 2 akan lebih dari 0, maka akan di print sebagai bilangan prima ganjil dan countganjil akan ditambah 1
                    if (i % 2 > 0) {
                        countganjil+=1;
                        System.out.print(i + " ");
                    }
                }
            }

        } // end of Ganjil

        // Perhitungan Genap
        System.out.println();
        countgenap=0;
        // jika bilangan yang di input pada awal sama dengan 2, maka akan di proses
        // disini aku bikin proses perhitungan bilangan genap di dalam if karena aku ingin membuat jika bilangan tersebut tidak berisi 2, maka akan memprint "tidak ada bilangan genap"
        if (starts == 2 || starts == 1 || starts == 0){
            System.out.print("Bilangan Prima genap antara " + starts + " - " + ends + " adalah ");

            for (int i = starts; i < ends; i++) {
                boolean isPrima = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrima = false;
                        break;
                    }
                }
                // jika bilangan prima berstatus true, maka akan di cek kembali apakah bilangan tersebut jika di mod 2 hasilnya sama dengan 0 atau tidak
                if (isPrima == true) {
                    if (i == 0 || i == 1) {
                        continue; // move to next iteration
                    } else {
                        // jika bilangan tersebut di mod 2 akan sama dengan 0, maka akan di print sebagai bilangan prima genap dan countgenap akan ditambah 1
                        if (i % 2 == 0) {
                            countgenap += 1;
                            System.out.print(i + " ");
                        }
                    }
                }
            } //end of Genap
        } else {
            System.out.print("Tidak ada bilangan prima yang genap antara " + starts + " - " + ends);
        }

        System.out.println();
        System.out.println();
        // menampilkan jumlah bilangan ganjil yang didapatkan
        System.out.print("Bilangan prima ganjil antara " + starts + " - " + ends + " berjumlah "+countganjil);
        System.out.println();
        // menampilkan jumlah bilangan genap yang didapatkan
        System.out.print("Bilangan prima genap antara " + starts + " - " + ends + " berjumlah "+countgenap);

        System.out.println();
    }

}
