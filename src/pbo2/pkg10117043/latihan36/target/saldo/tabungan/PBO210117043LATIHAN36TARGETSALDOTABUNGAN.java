//NAMA       : YUSRIZAL FALAHAN
 //* KELAS      : IF-2
// * MATAKULIAH : PBO2
 //* NIM        : 10117043
// * DESKRIPSI PROGRES : Program ini berisi saldo tabungan
package pbo2.pkg10117043.latihan36.target.saldo.tabungan;

public class PBO210117043LATIHAN36TARGETSALDOTABUNGAN {

    public static void main(String[] args) {

        targetSaldo saldo = new targetSaldo();
        saldo.nSaldo = 3500000;
        saldo.bulan = 1;

        saldo.hitungSaldo(saldo.nSaldo, saldo.bulan);

    }

}
