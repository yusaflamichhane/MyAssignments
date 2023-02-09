public class FeatureOverload {
    public static void main(String[] args) {
        Router router = new Router();
        int version =16;
        float x =16.6f;
        float y = 03.5f;
        router. cisco();
        router.cisco("ISR");
        router.cisco(version);
        router.cisco(version,x);
        router.cisco(y,version);
        
    }
}
class Router
{
    void cisco()
    {
        System.out.println(" Cisco Router Order Details");
    }
    void cisco (String name)
    {
        System.out.println("Cisco Router name is :"+name);
    }
    void cisco (int version)
    {
        System.out.println("Cisco Router version is :"+version);
    }
    void cisco ( int version, float upgradedVersion)
    {
        System.out.println("Cisco Router version is "+version+ "-------Upgraded to Version :"+upgradedVersion);
    }
    void cisco (float version, int upgradedVersion)
    {
        System.out.println("Cisco Router version is :"+version+ "-------Upgraded to Version :"+upgradedVersion);
    }
}