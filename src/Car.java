public abstract class Car implements Printable {
    public Car(String name, int engine, int year) {
        this.name = name;
        this.engine = engine;
        this.year = year;
    }

    private String name;
    private double engine;
    private int year;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getEngine() {return engine;}
    public void setEngine(int engine) {this.engine = engine;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
}

