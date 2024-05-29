/**
 * @BelongsProject: idea_demo
 * @BelongsPackage: PACKAGE_NAME
 * @Author: zt
 * @CreateTime: 2024-05-29  15:18
 * @Description:
 */

public class ComputeFactory {

    private static final Sub sub = new Sub();
    private static final Add add = new Add();

    public static Computable getCompute(char symbol) {
        switch (symbol) {
            case '+':
                return add;
            case '-':
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }

}
