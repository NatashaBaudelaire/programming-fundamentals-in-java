package ship;

public class trip {
    private static int idCounter = 1;

    private final int id;
    private String date;
    private char situation;
    private ContainerShip containerShip;
    private BulkCarrierShip bulkCarrierShip;

    public Trip(String date) {
        this.id = idCounter++;
        this.date = date;
        this.situation = 'P';
        this.containerShip = null;
        this.bulkCarrierShip = null;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public char getSituation() {
        return situation;
    }

    public ContainerShip getContainerShip() {
        return containerShip;
    }

    public BulkCarrierShip getBulkCarrierShip() {
        return bulkCarrierShip;
    }

    public boolean allocateContainerShip(ContainerShip ship) {
        if (ship.isAllocated()) return false;
        if (containerShip != null || bulkCarrierShip != null) return false;

        containerShip = ship;
        boolean success = ship.allocate();
        if (!success) {
            containerShip = null;
            return false;
        }
        return true;
    }

    public boolean allocateBulkCarrierShip(BulkCarrierShip ship) {
        if (ship.isAllocated()) return false;
        if (containerShip != null || bulkCarrierShip != null) return false;

        bulkCarrierShip = ship;
        boolean success = ship.allocate();
        if (!success) {
            bulkCarrierShip = null;
            return false;
        }
        return true;
    }

    public boolean startTrip() {
        Ship ship = (containerShip != null) ? containerShip : bulkCarrierShip;
        if (ship != null && ship.getStatus() == 'L') {
            situation = 'O';
            return true;
        }
        return false;
    }

    public boolean finishTrip() {
        Ship ship = (containerShip != null) ? containerShip : bulkCarrierShip;
        if (ship != null && ship.getStatus() == 'V') {
            situation = 'F';
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String shipInfo = "No ship allocated";
        if (containerShip != null) {
            shipInfo = "Container Ship: " + containerShip.toString();
        } else if (bulkCarrierShip != null) {
            shipInfo = "Bulk Carrier Ship: " + bulkCarrierShip.toString();
        }
        return String.format("Trip[id=%d, date=%s, situation=%c, %s]", id, date, situation, shipInfo);
    }
}

