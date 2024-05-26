package soal2;

/**
 *
 * @author Jidan Ainul Mutaqin
 */

// Kelas Staff sebagai subclass dari Employee
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString();
    }
}

