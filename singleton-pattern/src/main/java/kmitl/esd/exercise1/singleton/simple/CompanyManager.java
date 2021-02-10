package kmitl.esd.exercise1.singleton.simple;

public class CompanyManager {

    public static final CompanyManager INSTANCE = new CompanyManager();
    /**
     * A private constructor to other class
     *
     * @return void
     */
    protected CompanyManager() {

    }
    /**
     * function for get instance of companymanager
     *
     * @return INSTANCE
     */

    public static CompanyManager getInstance(){
        return INSTANCE;
    }

    public void doSthInstance() {
        System.out.println("Sth with the instance");
    }

    public static void doSth() {
        System.out.println("Sth");
    }

}
