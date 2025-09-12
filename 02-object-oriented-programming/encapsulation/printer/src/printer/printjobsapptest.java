package printer;

public class printjobsapptest {

    public static void main(String[] args) {
        Printer printer = new Printer(1);


        printer.receivePrint1("Coffee with Code: Exploring Java - Aldo Moura.pdf");
        System.out.println(printer);

        printer.receivePrint2("Secure Java: Best Practices and Security - Aldo Moura.pdf");
        System.out.println(printer);

        printer.receivePrint3("Java: Biggest Mistakes in the Logical World of Oscar - Aldo Moura.pdf");
        System.out.println(printer);

        printer.receivePrint4("The Path of the Javist - Aldo Moura.pdf");
        System.out.println(printer);


        System.out.println("\nFinishing print jobs:");

        if (!printer.finishPrint1()) {
            System.out.println("No print job to finish.");
        }
        System.out.println(printer);

        if (!printer.finishPrint2()) {
            System.out.println("No print job to finish.");
        }
        System.out.println(printer);

        if (!printer.finishPrint3()) {
            System.out.println("No print job to finish.");
        }
        System.out.println(printer);

        if (!printer.finishPrint4()) {
            System.out.println("No print job to finish.");
        }
        System.out.println(printer);
    }
}
