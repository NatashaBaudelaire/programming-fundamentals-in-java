package lesson;

public class Resource {
    private String name;
    private String type; // D = Digital, F = Physical

    public Resource(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return name + " (" + type + ")";
    }
}
