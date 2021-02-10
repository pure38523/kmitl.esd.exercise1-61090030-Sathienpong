package kmitl.esd.exercise1.composite;


import java.util.ArrayList;
import java.util.List;

public class Department implements BusinessUnit{
    private Integer id;
    private String name;

    private List<BusinessUnit> childBusinessUnit;

    public Department(Integer id, String name){
        this.id = id;
        this.name = name;
        this.childBusinessUnit = new ArrayList<>();
    }

    /**
     * Function add Business
     *
     * @param businessUnit business to add
     * @return void
     */
    public void addBusiness(BusinessUnit businessUnit){
        childBusinessUnit.add(businessUnit);
    }

    /**
     * A function for removing a department
     *
     * @param businessUnit business to remove
     * @return void
     */
    public void removeBusiness(BusinessUnit businessUnit){
        childBusinessUnit.remove(businessUnit);
    }

    /**
     * Function for printName
     *
     * @return void
     */
    @Override
    public void printBusinessName() {
        childBusinessUnit.forEach(BusinessUnit::printBusinessName);
    }
}
