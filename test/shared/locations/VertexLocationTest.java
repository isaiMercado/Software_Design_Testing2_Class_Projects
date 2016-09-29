package shared.locations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class VertexLocationTest {

    private HexLocation normHexLocation = new HexLocation(31, 47);
    private VertexLocation testLocationNE = new VertexLocation(normHexLocation, VertexDirection.NorthEast);
    private VertexLocation testLocationNW = new VertexLocation(normHexLocation, VertexDirection.NorthWest);

    @Test
    public void shouldReturnAdjacentLocationsToNeVertex() {
        HexLocation loc1 = new HexLocation(31, 46);
        HexLocation loc2 = new HexLocation(32, 46);

        List<HexLocation> result = testLocationNE.getAdjacentHexLocations();
        assertTrue(result.size() == 3);
        assertTrue(result.contains(normHexLocation));
        assertTrue(result.contains(loc1));
        assertTrue(result.contains(loc2));
    }

    @Test
    public void shouldReturnAdjacentLocationsToNwVertex() {
        HexLocation loc1 = new HexLocation(30, 47);
        HexLocation loc2 = new HexLocation(31, 46);

        List<HexLocation> result = testLocationNW.getAdjacentHexLocations();
        assertTrue(result.size() == 3);
        assertTrue(result.contains(normHexLocation));
        assertTrue(result.contains(loc1));
        assertTrue(result.contains(loc2));
    }
}