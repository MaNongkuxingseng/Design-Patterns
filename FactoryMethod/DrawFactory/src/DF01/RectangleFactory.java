package DF01;

class RectangleFactory extends ShapFactory {
    @Override
    Shap CreateShap(){
        return new Rectangle();
    };
}
