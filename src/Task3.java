import java.util.*;

class Device {
    private String name;
    private int year;
    private double price;
    private String color;
    private String type;

    public Device(String name, int year, double price, String color, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void print() {
        System.out.printf("Device{name='%s', year=%d, price=%.2f, color='%s', type='%s'}%n",
                name, year, price, color, type);
    }
}

class Task3 {
    static void Proceed() {
        List<Device> devices = Arrays.asList(
                new Device("qwe", 1990, 700, "Black", "Electronics"),
                new Device("asd", 2021, 123, "White", "Electronics"),
                new Device("zxc", 2022, 567, "White", "Not Electronics"),
                new Device("vbn", 2023, 78345, "Black", "Electronics")
        );

        System.out.println("All devices:");
        devices.forEach(Device::print);

        String color = "Black";
        System.out.println("\nDevices of color " + color + ":");
        devices.stream()
                .filter(device -> device.getColor().equalsIgnoreCase(color))
                .forEach(Device::print);

        int year = 2021;
        System.out.println("\nDevices from year " + year + ":");
        devices.stream()
                .filter(device -> device.getYear() == year)
                .forEach(Device::print);

        double minPrice = 500.0;
        System.out.println("\nDevices costing more than " + minPrice + ":");
        devices.stream()
                .filter(device -> device.getPrice() > minPrice)
                .forEach(Device::print);

        String type = "Electronics";
        System.out.println("\nDevices of type " + type + ":");
        devices.stream()
                .filter(device -> device.getType().equalsIgnoreCase(type))
                .forEach(Device::print);

        int startYear = 2020;
        int endYear = 2024;
        System.out.println("\nDevices released between " + startYear + " and " + endYear + ":");
        devices.stream()
                .filter(device -> device.getYear() >= startYear && device.getYear() <= endYear)
                .forEach(Device::print);
    }
}
