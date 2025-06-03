package ship;

public class main {
    public static void main(String[] args) {

        ContainerShip containerShip = new ContainerShip("Container A", 15000, 5, 3, 10);
        System.out.println("Container Ship registered:");
        System.out.println(containerShip);


        BulkCarrierShip bulkCarrierShip = new BulkCarrierShip("Bulk Carrier B", 20000, 4, 2, 12);
        System.out.println("\nBulk Carrier Ship registered:");
        System.out.println(bulkCarrierShip);


        Trip trip = new Trip("2025-06-01");
        System.out.println("\nTrip registered:");
        System.out.println(trip);


        boolean allocated = trip.allocateContainerShip(containerShip);
        System.out.println("\nAllocating container ship to the trip:");
        System.out.println("Allocation " + (allocated ? "successful" : "failed"));
        System.out.println(trip);


        boolean startedLoading = containerShip.startLoading();
        System.out.println("\nStarting loading of container ship:");
        System.out.println("Loading start " + (startedLoading ? "successful" : "failed"));
        System.out.println(containerShip);

        boolean finishedLoading = containerShip.finishLoading();
        System.out.println("\nFinishing loading of container ship:");
        System.out.println("Loading finish " + (finishedLoading ? "successful" : "failed"));
        System.out.println(containerShip);


        boolean startedTrip = trip.startTrip();
        System.out.println("\nStarting the trip:");
        System.out.println("Trip " + (startedTrip ? "started" : "could not be started"));
        System.out.println(trip);


        boolean finishedTrip = trip.finishTrip();
        System.out.println("\nTrying to finish the trip (before unloading):");
        System.out.println("Finish " + (finishedTrip ? "successful" : "failed"));
        System.out.println(trip);


        boolean unloaded = containerShip.unload();
        System.out.println("\nUnloading container ship:");
        System.out.println("Unload " + (unloaded ? "successful" : "failed"));
        System.out.println(containerShip);


        finishedTrip = trip.finishTrip();
        System.out.println("\nFinishing the trip:");
        System.out.println("Finish " + (finishedTrip ? "successful" : "failed"));
        System.out.println(trip);
    }
}

