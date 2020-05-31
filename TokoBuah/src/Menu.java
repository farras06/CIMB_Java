package TokoBuah.src;

public class Menu {

    public static void tambahBuah() {
        while (true) {
            String inputNama = Console.readInputString("Nama buah: ");
            int inputHarga = Console.readInputNumber("Harga buah: ");
            System.out.print("Stock buah: ");
            int inputStock = App.scanner.nextInt();

            Buah buah = new Buah(inputNama, inputHarga, inputStock);

            App.listBuah.add(buah);

            System.out.println("Repeat? (y/n)");
            String option = App.scanner.next();
            if (option.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void tampilMenu() {
        System.out.println("========== LIST BUAH ==========");
        for (int i = 0; i < App.listBuah.size(); i++) {
            System.out.println((i + 1) + ". " + App.listBuah.get(i).getNama() + " || " + App.listBuah.get(i).getHarga()
                    + " || " + App.listBuah.get(i).getStock() + " pcs");
        }
    }

}