package kmitl.esd.exercise1.singleton.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyManagerTest {

    /**
     * Test that companyManager not null
     */
    @Test
    void getInstance() {
        assertNotEquals(CompanyManager.getInstance(), null);
    }

    @Test
    void doSthInstance() {
    }

    @Test
    void doSth() {
    }
}