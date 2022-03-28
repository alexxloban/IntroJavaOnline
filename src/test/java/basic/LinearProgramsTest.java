package basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearProgramsTest {

    @Test
    public void firstTaskShouldReturnResult() {
        double result = LinearPrograms.firstTask(8, 2, 3.25);
        Assertions.assertEquals(result, 8,8.25);
    }
}