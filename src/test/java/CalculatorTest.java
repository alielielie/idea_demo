import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @BelongsProject: idea_demo
 * @BelongsPackage: PACKAGE_NAME
 * @Author: zt
 * @CreateTime: 2024-05-29  10:49
 * @Description:
 */
public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult =  calculator.compute(1, 1, "Add");
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn0When1Sub1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult =  calculator.compute(1, 1, "Sub");
        int expectResult = 0;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn4When2Multi2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult =  calculator.compute(2, 2, "Multi");
        int expectResult = 4;
        Assert.assertEquals(expectResult, actualResult);
    }


}