public class Program {
  public static void main(String[] args) {
    Image image1 = new ProxyImage("cat_picture.jpg");
    Image image2 = new ProxyImage("dog_picture.jpg");

    image1.display();

    image1.display();

    image2.display();
  }
}
