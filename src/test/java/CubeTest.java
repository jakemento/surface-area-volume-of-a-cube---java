import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {
  @Test
  public void volume_determinestheVolumeofthecube_1000() {
    Rectangle testRectangle = new Rectangle(10,10);
    Cube testCube = new Cube(testRectangle);
    assertEquals(1000, testCube.volume());
  }

  @Test
  public void area_determinesSurfaceAreaoftheCube_2000() {
    Rectangle testRectangle = new Rectangle(10, 10);
    Cube testCube = new Cube(testRectangle);
    assertEquals(2000, testCube.surfaceArea());
  }
}
