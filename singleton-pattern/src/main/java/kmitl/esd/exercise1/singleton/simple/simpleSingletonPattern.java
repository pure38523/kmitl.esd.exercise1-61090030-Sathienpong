package kmitl.esd.exercise1.singleton.simple;

import java.util.logging.Logger;

public class simpleSingletonPattern {
    /**
     * A main function showing that the implementation works.
     *
     * @return void
     */
    public static void main(String args[]) {
        CompanyManager companyManager = CompanyManager.getInstance();

        Logger.getLogger(simpleSingletonPattern.class.getName()).info("Simple singleton companyManager: " + companyManager);
    }
}
