package eightKyu;

/**
 * 8 kyu - Volume of a Cuboid
 * @author Jiayu Zhang @version 2020-04-28
 *
 * Bob needs a fast way to calculate the volume of a cuboid with three values: 
 * length, width and the height of the cuboid. 
 * Write a function to help Bob with this calculation.
 */
public class VolumeOfCuboid {
 public static double getVolumeOfCuboid(final double length, final double width, final double height) {
	 return length * width * height;
 }
}

/*
 * import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class SolutionTests {

  private static final double delta = 0.0001;
  
  @Test
  public void examples() {
      // assertEquals("expected", "actual");
      assertEquals(4, Kata.getVolumeOfCuboid(1, 2, 2), delta);
      assertEquals(63, Kata.getVolumeOfCuboid(6.3, 2, 5), delta);
  }
  
  @Test
  public void other() {
      // assertEquals("expected", "actual");
      assertEquals(60, Kata.getVolumeOfCuboid(2, 5, 6), delta);
      assertEquals(94.5, Kata.getVolumeOfCuboid(6.3, 3, 5), delta);
  }
  
  @Test
  public void random() {
    final Random rand = new Random();
    for (int r=0; r<10; r++) {
      final double l = rand.nextDouble() * 100.;
      final double w = rand.nextDouble() * 100.;
      final double h = rand.nextDouble() * 100.;
      //System.out.println(String.format("length=%f, width=%f, height=%f", l, w, h));
      assertEquals(l*w*h, Kata.getVolumeOfCuboid(l, w, h), delta);
    }
  }
}
*/
