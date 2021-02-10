package kmitl.esd.exercise1.composite;

import org.junit.jupiter.api.Test;

class DepartmentTest {

    @Test
    void addBusiness() {
        BusinessUnit team1 = new Team(1,"Team1");
        BusinessUnit team2 = new Team(1,"Team2");

        Department department = new Department(3,"department");

        department.addBusiness(team1);
        department.addBusiness(team2);


    }

    @Test
    void removeBusiness() {
        BusinessUnit team1 = new Team(1,"Team1");
        BusinessUnit team2 = new Team(1,"Team2");

        Department department = new Department(3,"department");

        department.addBusiness(team1);
        department.addBusiness(team2);
        department.removeBusiness(team2);


    }

    @Test
    void printBusinessName() {

    }
}