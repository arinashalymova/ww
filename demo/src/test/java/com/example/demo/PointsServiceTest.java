import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(webEnvironment = NONE)
public class PointsServiceTest {

    @Autowired
    private PointsService pointsService;

    @MockBean
    private PointsRepository pointsRepository;

    @Test
    public void testGetAllPoints() {
        Point point1 = new Point(1L, "Пушкин", 55.763702, 37.604795);
        Point point2 = new Point(2L, "Dr. Живаго", 55.756718, 37.614085);

        when(pointsRepository.findAll()).thenReturn(Arrays.asList(point1, point2));

        List<Point> allPoints = pointsService.getAllPoints();

        assertEquals(2, allPoints.size());
        assertEquals("Пушкин", allPoints.get(0).getName());
        assertEquals("Dr. Живаго", allPoints.get(1).getName());
    }


}
