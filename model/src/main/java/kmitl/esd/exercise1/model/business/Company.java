package kmitl.esd.exercise1.model.business;

/**
 * Superclass for the company inh. tree
 */
public abstract class Company implements ICompany {

    private String taxId;

    /**
     * factory method for subclasses
     * @param companyType type of the company
     * @return return an object of the company type
     */
    public static Company create(CompanyType companyType) {
        Company company = null;
        switch (companyType) {
            case LOCAL:
                company = new LocalCompany();
            case FOREIGN:
                company = new ForeignCompany();
        };
        return company;
    }

    // fields
    protected long id;
    protected String name;

    // Constructor
    public Company() {
    }

    /**
     * getter method
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * setting id method
     *
     * @param id company id
     * @return void
     */

    public void setId(long id) {
        this.id = id;
    }

    /**
     * getting name method
     *
     * @return name
     */

    public String getName() {
        return name;
    }
    /**
     * setting name
     *
     * @return null
     */
    public String setName() {
        return null;
    }
    /**
     * setting name method
     *
     * @param name company name
     * @return void
     */

    public void setName(String name) {
        this.name = name;
    }
    /**
     * getting Tax ID
     *
     * @return void
     */

    public String getTaxId() {
        return this.taxId;
    }
}
