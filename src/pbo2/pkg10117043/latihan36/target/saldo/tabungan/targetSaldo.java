/*
 * NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi saldo tabungan
 */
package pbo2.pkg10117043.latihan36.target.saldo.tabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class targetSaldo {

    int nSaldo, bulan;

    public void hitungSaldo(int parSaldo, int parBulan) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        while (parSaldo <= 6000000) {

            parSaldo = (int) ((parSaldo * 0.08) + parSaldo);
            //System.out.printf("Saldo di bulan ke-" + bulan + " Rp.%,-10d%n", nSaldo);
            System.out.printf("Saldo di bulan ke-" + parBulan + " Rp.%s \n", kursIndonesia.format(parSaldo));
            parBulan = parBulan + 1;

        }
    }
}
