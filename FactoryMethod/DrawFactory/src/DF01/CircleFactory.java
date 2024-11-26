package DF01;

class CircleFactory  extends ShapFactory {
    @Override
    Shap CreateShap(){
        return new CircleShap();
    };
}
