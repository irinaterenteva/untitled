package day36_overloadingMethods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();
        Picture.draw(100); // int type
        Picture.draw("red"); // String type
        Picture.draw("blue", "green"); // two String

        String s = "200";
        Picture.draw(s);
        Picture.draw(300, "blue");
        Picture.draw("blue", 300);
    }
}
