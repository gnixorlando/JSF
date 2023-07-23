/**
 *
 * @author paulohenrique
 * Test java environment
 */

public class TestApplication {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        System.out.println("APPLICATION RUNNING: " + javaVersion);
        System.out.println("TIP: This application must run in the environment with JDK 8");
    }
}
