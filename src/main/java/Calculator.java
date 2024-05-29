/**
 * @BelongsProject: idea_demo
 * @BelongsPackage: PACKAGE_NAME
 * @Author: zt
 * @CreateTime: 2024-05-29  10:48
 * @Description:
 */

public class Calculator {
    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computable computable = ComputeFactory.getCompute(symbol);
        return computable.compute(num1, num2);
    }
}
