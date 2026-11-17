package dz.univ;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
public void shouldReturnCorrectTriangleType() {
    App app=new App();
    assertEquals("EQUILATERAL", app.getTypeTriangle(5, 5, 5));
    assertEquals("ISOSCELES", app.getTypeTriangle(5, 5, 3));
    assertEquals("SCALENE", app.getTypeTriangle(3, 4, 5));
}
}
