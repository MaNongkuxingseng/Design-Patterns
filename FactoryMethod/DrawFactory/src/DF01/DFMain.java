package DF01;

public class DFMain {
    public static void main(String[] args) {
        ShapFactory circlecFactory = new CircleFactory();
        Shap cirlce = circlecFactory.CreateShap();
        cirlce.Draw();

        ShapFactory RectangleFactory = new RectangleFactory();
        Shap rectangle =  RectangleFactory.CreateShap();
        rectangle.Draw();
    }
}
