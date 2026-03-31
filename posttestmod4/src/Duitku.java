import java.util.Scanner;

class DuitKu {
    String nama, noHP;
    int saldo = 0;

    // constructor
    DuitKu(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    // setor (min 10.000)
    void setor(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Setor gagal!, saldo Minimal Rp 10.000");
        } else {
            saldo = jumlah + saldo;
            System.out.println("Setor berhasil: Rp " + jumlah);
        }
    }

    // bayar
    void bayar(int tagihan) {
        if (saldo >= tagihan) {
            saldo = saldo - tagihan;
            System.out.println("Pembayaran berhasil: Rp " + tagihan);
        } else {
            System.out.println("Saldo gak cukup!");
        }
    }
}

