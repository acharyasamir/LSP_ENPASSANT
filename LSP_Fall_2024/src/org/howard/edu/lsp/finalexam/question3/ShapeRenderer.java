/**
*  Name: Samir Acharya
*/

package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
    public void renderShape(String shapeType) {
        Shape shape = ShapeFactory.getInstance().getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");
        renderer.renderShape("rectangle");
        renderer.renderShape("triangle");
        renderer.renderShape("hexagon"); // Unknown shape type
    }
}
