package kmitl.esd.exercise1.model.business;

public class LocalCompany extends Company{

    /**
     * get companytype method
     *
     * @return company type
     */
    public CompanyType getCompanyType() {
        return CompanyType.LOCAL;
    }

    /**
     * get companyname method
     *
     * @return name
     */
    public String getName() {
        return "Local Comp." + name;
    }

    public void something() {

    }
}
