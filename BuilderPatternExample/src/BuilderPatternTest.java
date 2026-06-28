public class BuilderPatternTest {

    public static void main(String[] args) {

        // Basic Computer
        Computer computer1 = new Computer.Builder("Intel i5", 8)
                .build();

        // Gaming Computer
        Computer computer2 = new Computer.Builder("Intel i9", 32)
                .setStorage(1000)
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        // Office Computer
        Computer computer3 = new Computer.Builder("AMD Ryzen 5", 16)
                .setStorage(512)
                .setOperatingSystem("Ubuntu")
                .build();

        computer1.display();
        computer2.display();
        computer3.display();
    }
}