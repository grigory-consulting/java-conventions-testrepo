public class Test {

    private String name;
    private int Alter;
    private double kontoStand;

    public Test(String name, int alter) {
        this.name = name;
        this.Alter = alter;
    }

    public String getName() {
        return name;
    }

    public void PrintInfo() {
        System.out.println(name + " (" + Alter + ")");
    }

    public double berechneZinsen(double satz) {
        return kontoStand * satz;
    }
}

class helper {

    private int Zaehler;

    public void erhoehe() {
        Zaehler++;
    }
}
