public class Computer {

    // Required attributes
    private String cpu;
    private int ram;

    // Optional attributes
    private int storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Display configuration
    public void display() {
        System.out.println("Computer Configuration");
        System.out.println("----------------------");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println();
    }

    // Static Nested Builder Class
    public static class Builder {

        // Required attributes
        private String cpu;
        private int ram;

        // Optional attributes
        private int storage = 256;
        private String graphicsCard = "Integrated";
        private String operatingSystem = "No OS";

        // Constructor for required fields
        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}