public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(13.2, 22.2);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println("area = " + wall.getArea());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());
    }
}