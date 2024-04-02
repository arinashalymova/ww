import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PointsController.class)
public class PointsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PointsService pointsService;

    @Test
    public void testGetPoints() throws Exception {
        when(pointsService.getAllPoints()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/points"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }


}
