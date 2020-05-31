package OOP.src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Employee orang = new Employee();
        
        orang.overtime = 5;
        orang.salary = 50_000;
        orang.payPerHour = 100;

        Scanner scannerOverTime = new Scanner(System.in);
        System.out.print("Input overtime: "); // output
        orang.setOvertime(scannerOverTime.nextInt());

        Scanner scannerSalary = new Scanner(System.in);
        System.out.print("Input salary: "); // output
        orang.setsalary(scannerSalary.nextInt());

        Scanner scannerPayPerHour = new Scanner(System.in);
        System.out.print("Input payPerHour: "); // output
        orang.setPayPerHour(scannerPayPerHour.nextInt());

        System.out.println(orang.calculateWage());

    }

    public static int calculateWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    };

}

