
package printer;

public class printjob {

    private int printerId;
    private String fileName;
    private boolean status;

    public PrintJob(String fileName, int printerId, boolean status) {
        this.printerId = printerId;
        this.fileName = fileName;
        this.status = status;
    }

    public void startJob() {
        this.status = true;
        System.out.println("Starting print job for file: " + fileName);
    }

    public int getPrinterId() {
        return printerId;
    }

    public void setPrinterId(int printerId) {
        this.printerId = printerId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
