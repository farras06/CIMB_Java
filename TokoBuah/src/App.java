package TokoBuah.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        // Tampilan menu
        // 1. Tambah buah
        // 2. List buah
        // 3. Exit
        while (true) {

            System.out.println("======MENU=====");
            System.out.println("1. Tambah Buah");
            System.out.println("2. List Buah");
            int option = scanner.nextInt();
            if (option == 1) {

                Menu.tambahBuah();
            } else if (option == 2) {

                Menu.tampilMenu();
                break;
            }
        }

    }

}
