import org.junit.jupiter.api.Test;

public class JunitTest {
    @Test
    public void testIsNumberPositive() {
        StringUtils stringUtils = new StringUtils();
        assert stringUtils.isPositiveNumber("1");
    }
}
