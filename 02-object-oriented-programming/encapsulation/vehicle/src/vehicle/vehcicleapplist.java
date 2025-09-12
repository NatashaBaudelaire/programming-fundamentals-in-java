package vehicle;
	import java.util.ArrayList;
	import java.util.List;
public class vehcicleapplist {


	public class vehcicleapplist {
	    public static void main(String[] args) {

	        List<Manufacturer> manufacturers = new ArrayList<>();
	        manufacturers.add(new Manufacturer("Volkswagen AG", "Germany"));
	        manufacturers.add(new Manufacturer("Toyota Motor Corporation", "Japan"));


	        List<Vehicle> vehicles = new ArrayList<>();
	        vehicles.add(new Vehicle("P", 50, "Golf", "2022-01-15", manufacturers.get(0)));
	        vehicles.add(new Vehicle("U", 80, "Transporter", "2021-06-30", manufacturers.get(0)));
	        vehicles.add(new Vehicle("P", 45, "Corolla", "2023-02-10", manufacturers.get(1)));
	        vehicles.add(new Vehicle("U", 90, "Hilux", "2022-11-05", manufacturers.get(1)));


	        System.out.println("Registered Vehicles:");
	        for (Vehicle v : vehicles) {
	            System.out.printf("ID: %d, Model: %s, Type: %s, Acquisition Date: %s, Manufacturer: %s, Country: %s%n",
	                v.getVehicleId(), v.getModel(), v.getType(), v.getAcquisitionDate(),
	                v.getManufacturer().getCompanyName(), v.getManufacturer().getCountry());
	        }


	        Vehicle firstVehicle = vehicles.get(0);
	        double litersUsed = firstVehicle.fillTank();
	        System.out.printf("%nFilled the first vehicle’s tank with %.2f liters.%n", litersUsed);
	        System.out.printf("ID: %d, Model: %s, Tank Capacity: %d, Liters in Tank: %.2f%n",
	            firstVehicle.getVehicleId(), firstVehicle.getModel(),
	            firstVehicle.getTankCapacity(), firstVehicle.getLitersInTank());


	        Vehicle thirdVehicle = vehicles.get(2);
	        boolean refuelSuccess = thirdVehicle.refuel(20);
	        System.out.printf("%nAttempt to refuel 20 liters in third vehicle: %s%n", refuelSuccess ? "Success" : "Failed");
	        System.out.printf("ID: %d, Model: %s, Tank Capacity: %d, Liters in Tank: %.2f%n",
	            thirdVehicle.getVehicleId(), thirdVehicle.getModel(),
	            thirdVehicle.getTankCapacity(), thirdVehicle.getLitersInTank());


	        boolean consumptionRegistered = thirdVehicle.registerConsumption(10);
	        System.out.printf("%nRegister consumption of 10 liters on third vehicle: %s%n", consumptionRegistered ? "Success" : "Failed");
	        System.out.printf("ID: %d, Model: %s, Tank Capacity: %d, Liters in Tank: %.2f%n",
	            thirdVehicle.getVehicleId(), thirdVehicle.getModel(),
	            thirdVehicle.getTankCapacity(), thirdVehicle.getLitersInTank());
	    }
	}
}
