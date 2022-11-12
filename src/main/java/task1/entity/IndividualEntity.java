package task1.entity;

public class IndividualEntity extends Customer {

    private final String name;
    private final String surname;
    private final int passId;

    public IndividualEntity(String name, String surname, int passId) {
        super();
        this.name = name;
        this.surname = surname;
        this.passId = passId;
    }

    @Override
    public int getId() {
        return passId;
    }

    @Override
    public void getCustomerInfo() {
         System.out.println("Customer name is: " + name +
                 "\nCustomer surname is: " + surname +
                 "\nCustomer passID is : " + passId +
                 "\nCustomer active is : " + this.allActive());
    }
}
