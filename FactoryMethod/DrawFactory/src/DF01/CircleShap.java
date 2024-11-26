package DF01;
// 没有显式声明属性的访问修饰符（如 public、private 或 protected）
// 那么这些属性将默认使用包级访问（也称为“默认访问”或“包私有”）。这意味着这些属性只能在同一个包内的类中访问。
class CircleShap implements Shap {

    @Override
    public void Draw() {
        System.out.println("Print a circle.");
    }

}
