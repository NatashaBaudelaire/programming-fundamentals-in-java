package Tests;

public class Tests {
    public int idTest;
    public int glucoseLevel;

    public String getDiagnosis() {
        if (glucoseLevel < 100) {
            return "Normal";
        } else if (glucoseLevel <= 125) {
            return "Prediabetes";
        } else {
            return "Diabetes";
        }
    }
}
