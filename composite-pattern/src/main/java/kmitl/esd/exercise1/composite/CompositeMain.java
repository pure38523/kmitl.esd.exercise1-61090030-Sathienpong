package kmitl.esd.exercise1.composite;

public class CompositeMain {
    /**
     * A main function for showing that the implementation works
     *
     * @return void
     */
    public static void main(String[] args){
        BusinessUnit team1 = new Team(1,"Team1");
        BusinessUnit team2 = new Team(1,"Team2");

        Department department = new Department(3,"department");

        department.addBusiness(team1);
        department.addBusiness(team2);

        department.printBusinessName();
    }
}
