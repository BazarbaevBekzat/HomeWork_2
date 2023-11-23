public class Main {
    private static Object Car;
    public static void main(String[] args) {

        System.out.println();
        Car Bmw = createObject("Bmw");
        System.out.println(Bmw);
        Bmw.print();
        System.out.println();
        Car Audi = createObject("Audi");
        System.out.println(Audi);
        Audi.print();
        System.out.println();
        Car Mercedes = createObject("Mersedes");
        System.out.println(Mercedes);
        Mercedes.print();
    }

    public static Car createObject(String claasName) {
        switch (claasName) {
            case "Bmw":
                return new Bmw("X7",5,2019,"drift car",4);
            case  "Audi":
                return new Audi("A7",5,2010,"city car",4);
            default:
                return  new Mercedes("Cls 63",5,2011,"city car", 4);

        }
    }
}


