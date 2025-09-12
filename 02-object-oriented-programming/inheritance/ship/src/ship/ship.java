package ship;

public class ship {
	private static int idCounter = 101;

    protected final int id;
    protected String name;
    protected double cargoCapacity;
    protected boolean allocated;
    protected char status;
    protected int cranesQuantity;
    protected int layersQuantity;
    protected int hatchesQuantity;

    public Ship(String name, double cargoCapacity, int cranes, int layers, int hatches) {
        this.id = idCounter++;
        this.name = name;
        this.cargoCapacity = cargoCapacity;
        this.allocated = false;
        this.status = 'V';
        this.cranesQuantity = cranes;
        this.layersQuantity = layers;
        this.hatchesQuantity = hatches;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public char getStatus() {
        return status;
    }

    public int getCranesQuantity() {
        return cranesQuantity;
    }

    public void setCranesQuantity(int cranesQuantity) {
        this.cranesQuantity = cranesQuantity;
    }

    public int getLayersQuantity() {
        return layersQuantity;
    }

    public void setLayersQuantity(int layersQuantity) {
        this.layersQuantity = layersQuantity;
    }

    public int getHatchesQuantity() {
        return hatchesQuantity;
    }

    public void setHatchesQuantity(int hatchesQuantity) {
        this.hatchesQuantity = hatchesQuantity;
    }

    public boolean allocate() {
        if (!allocated && status == 'V') {
            allocated = true;
            return true;
        }
        return false;
    }

    public boolean startLoading() {
        if (allocated && status == 'V') {
            status = 'C';
            return true;
        }
        return false;
    }

    public boolean finishLoading() {
        if (status == 'C') {
            status = 'L';
            return true;
        }
        return false;
    }

    public boolean unload() {
        if (status == 'L') {
            status = 'V';
            allocated = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Ship[id=%d, name=%s, cargoCapacity=%.2f, allocated=%b, status=%c, cranes=%d, layers=%d, hatches=%d]",
                id, name, cargoCapacity, allocated, status, cranesQuantity, layersQuantity, hatchesQuantity);
    }
}

