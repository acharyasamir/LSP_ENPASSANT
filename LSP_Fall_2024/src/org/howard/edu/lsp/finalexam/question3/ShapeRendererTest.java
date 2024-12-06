/**
*  Name: Samir Acharya
*/

package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeRendererTest {

    @Test
    void testShapeFactory() {
        ShapeFactory factory = ShapeFactory.getInstance();

        assertTrue(factory.getShape("circle") instanceof Circle);
        assertTrue(factory.getShape("rectangle") instanceof Rectangle);
        assertTrue(factory.getShape("triangle") instanceof Triangle);
        assertNull(factory.getShape("hexagon"));
    }

    @Test
    void testRenderShape() {
        ShapeRenderer renderer = new ShapeRenderer();

        // Capture outputs for testing (you can use SystemOutRule for advanced testing)
        renderer.renderShape("circle");
        renderer.renderShape("rectangle");
        renderer.renderShape("triangle");
        renderer.renderShape("hexagon");
    }
}
