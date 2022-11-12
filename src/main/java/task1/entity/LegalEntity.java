package task1.entity;

public class LegalEntity extends Customer {

    private final String nameOfLegalEntity;
    private final int registrationNumber;

    public LegalEntity(String nameOfLegalEntity, int registrationNumber) {
        super();
        this.nameOfLegalEntity = nameOfLegalEntity;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public int getId() {
        return registrationNumber;
    }

    @Override
    public void getCustomerInfo() {
        System.out.println("Customer name is: " + nameOfLegalEntity +
                "\nCustomer registration number is : " + registrationNumber +
                "\nCustomer active is : " + this.allActive());
    }
}
