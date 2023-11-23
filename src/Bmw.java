public class Bmw extends Car{
    private String type;
    private int wheel;
    public Bmw(String name, int engine, int year, String type, int wheel) {
        super(name, engine, year);
        this.type = type;
        this.wheel = wheel;
    }

    @Override
    public void print() { System.out.println("Данные машины \n" + "type" + " " + type + "\n" + "wheel" + " " + wheel); }
}

