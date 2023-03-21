public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String model, int wheels, int gears) {
        super(model, wheels);
        gearCount = gears;
    }

    public int getGearCount() {
        return gearCount;
    }

    public static void ringBell() {
        System.out.println("Ring Ring Ring!!!");
    }

}
