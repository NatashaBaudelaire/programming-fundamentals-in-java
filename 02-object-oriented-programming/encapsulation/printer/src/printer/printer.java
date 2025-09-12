package printer;

import java.util.ArrayList;

public class printer {

    private int printerId;
    private boolean printing;
    private ArrayList<PrintJob> printJobs;

    public Printer(int printerId) {
        this.printerId = printerId;
        this.printing = false;
        this.printJobs = new ArrayList<>();
    }

    public int getPrinterId() {
        return printerId;
    }

    public void setPrinterId(int printerId) {
        this.printerId = printerId;
    }

    public boolean isPrinting() {
        return printing;
    }

    public void setPrinting(boolean printing) {
        this.printing = printing;
    }

    public ArrayList<PrintJob> getPrintJobs() {
        return printJobs;
    }

    public void setPrintJobs(ArrayList<PrintJob> printJobs) {
        this.printJobs = printJobs;
    }

    @Override
    public String toString() {
        String status = printing ? "Printing" : "In queue";
        String fileName = printJobs.isEmpty() ? "No file" : printJobs.get(0).getFileName();

        return "File: " + fileName +
               " | Printer ID: " + printerId +
               " | Status: " + status;
    }

    public void receivePrint1(String string) {

        public void receivePrint2(String string) {
        }

        public void receivePrint3(String string) {
        }

        public void receivePrint4(String string) {
        }

        public void finishPrint1() {
        }

        public void finishPrint2() {
        }

        public void finishPrint3() {
        }

        public void finishPrint4() {
        }
    }
}
