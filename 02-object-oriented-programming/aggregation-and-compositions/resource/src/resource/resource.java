import java.util.ArrayList;

public class lesson {
    private String date;
    private String title;
    private ArrayList<Resource> resources;

    public Lesson(String date, String title) {
        this.date = date;
        this.title = title;
        this.resources = new ArrayList<>();
    }

    public void addResource(Resource r) {
        resources.add(r);
    }

    public void showLesson() {
        System.out.println("Lesson Title: " + title);
        System.out.println("Date: " + date);
        System.out.println("Resources:");
        for (Resource r : resources) {
            System.out.println("- " + r);
        }
    }
}
