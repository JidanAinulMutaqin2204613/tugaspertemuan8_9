package soal2;

import java.util.Date;

/**
 *
 * @author Jidan Ainul Mutaqin
 */

// Kelas MyDate yang digunakan untuk menyimpan tanggal
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        Date date = new Date();
        this.year = date.getYear() + 1900;
        this.month = date.getMonth() + 1;
        this.day = date.getDate();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
