/**
*  Name: Samir Acharya
*/

package org.howard.edu.lsp.finalexam.question3;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
