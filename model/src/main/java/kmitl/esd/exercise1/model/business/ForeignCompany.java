package kmitl.esd.exercise1.model.business;

// derived class, Company is the super class
// ForeignCompany inherits Company
// superclass is not an interface -> behavioral inheritance
public class ForeignCompany extends Company{
    // -> behavioral inheritance

    /**
     * get companytype method
     *
     * @return company type
     */
    public CompanyType getCompanyType() {
        return CompanyType.FOREIGN;
    }

    /**
     * get companyname method
     *
     * @return name
     */

    public String getName() {
        return "Foreign Comp." + name;
    }
}
