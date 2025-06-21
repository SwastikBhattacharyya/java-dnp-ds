public class Program {
  public static void main(String[] args) {
    Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();

    Computer gamingComputer =
        new Computer.Builder("Intel i9", "32GB")
            .storage("1TB SSD")
            .graphicsCard("NVIDIA RTX 4080")
            .operatingSystem("Windows 11")
            .build();

    Computer devComputer =
        new Computer.Builder("AMD Ryzen 9", "64GB")
            .storage("2TB SSD")
            .operatingSystem("Linux Ubuntu")
            .build();

    System.out.println(basicComputer);
    System.out.println(gamingComputer);
    System.out.println(devComputer);
  }
}
