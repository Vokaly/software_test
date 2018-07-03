package ru.stqa.pft.sandbox.point.;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.point.Distance;

public class DistanceTest {

    @Test
    public void testArea() {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(4.0, 6.0);
        Assert.assertEquals(Distance.distance(p1,p2),1.0);
}
