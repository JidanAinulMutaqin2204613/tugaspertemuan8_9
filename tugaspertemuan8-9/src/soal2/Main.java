package soal2;

/**
 *
 * @author Jidan Ainul Mutaqin
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kaela", "Jl. Senopati, Jakarta Selatan", "081221928401", "kael@yahoo.com");
        Student student = new Student("Davion", "Jl. Midlane, Garut ", "091221928403", "dragon@yahoo.com", Student.SENIOR);
        Employee employee = new Employee("Mirana", "Pakuncen, Ciamis", "081221928504", "pristessmoon@google.com", "Office 101", 50000, new MyDate(2020, 5, 21));
        Faculty faculty = new Faculty("Dr. Jidan AM", "Panaragan, Ciamis", "089668581306", "jidanainulmutaqin@google.com", "Office 202", 75000, new MyDate(2018, 3, 10), 10, "Professor");
        Staff staff = new Staff("Sarah Moonfeng", "Sadananya, Ciamis", "081221928744", "sarah@gmail.com", "Office 303", 45000, new MyDate(2015, 8, 5), "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
