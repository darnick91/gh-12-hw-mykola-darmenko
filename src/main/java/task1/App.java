package task1;

import task1.actives.Active;
import task1.actives.CurrentDollarsAcc;
import task1.actives.DepositAcc;
import task1.actives.PreciousMetalsAcc;
import task1.entity.Customer;
import task1.entity.IndividualEntity;
import task1.entity.LegalEntity;

import java.time.LocalDate;
import java.util.Scanner;

import static task1.actives.DepositAcc.getCurrency;
import static task1.actives.DepositAcc.getYearPercent;

public class App {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        do {
            System.out.println("Press: " +
                    "\n'1' if you want to add new customer;" +
                    "\n'2' if you need more information about customer;" +
                    "\n'3' if you need to add actives of customer;" +
                    "\n'4' if you need more information about customer actives;" +
                    "\n'5' if you need to know all actives in the bank.");
            int input = scanner.nextInt();

            switch (input) {

                case (1):
                    System.out.println("Press: " +
                            "\n'1' if you want to choose Individual;" +
                            "\n'2' if you want to choose Legal Entity.");
                    int inputEntity = scanner.nextInt();

                    Customer customer = null;

                    switch (inputEntity) {
                        case (1):
                            System.out.println("Type the name: ");
                            String individualName = scanner.nextLine();
                            System.out.println("Type the surname: ");
                            String individualSurname = scanner.nextLine();
                            System.out.println("Type the passport ID: ");
                            int individualPassId = scanner.nextInt();
                            customer = new IndividualEntity(individualName, individualSurname, individualPassId);
                            break;
                        case (2):
                            System.out.println("Type the name of Legal Entity: ");
                            String legalEntityName = scanner.nextLine();
                            System.out.println("Type the registration Number: ");
                            int registrationNumber = scanner.nextInt();
                            customer = new LegalEntity(legalEntityName, registrationNumber);
                            break;
                        default:
                            System.out.println("Unreachable statement");
                            break;
                    }

                    bank.addCustomer(customer);

                    System.out.println("Congratulation!" +
                            "\nThe new customer was added");
                    break;

                case (2):
                    System.out.println("Please, type customer`s passport ID: ");
                    int id = scanner.nextInt();
                    bank.getCustomerById(id).getCustomerInfo();
                    break;

                case (3):
                    System.out.println("Please, type customer`s passport ID to add active: ");
                    int idActive = scanner.nextInt();
                    System.out.println("Press: " +
                            "\n'1' if you choose current dollars account;" +
                            "\n'2' if you choose precious metals account." +
                            "\n'3' if you choose deposit account;");
                    int typeActive = scanner.nextInt();

                    Customer customerActive = bank.getCustomerById(idActive);

                    Active active = null;

                    switch (typeActive) {
                        case (1):
                            System.out.println("Please enter amount of money what you put in: ");
                            double amountToDollarAccount = scanner.nextDouble();
                            active = new CurrentDollarsAcc(amountToDollarAccount);
                            break;

                        case (2):
                            System.out.println("Please, choose type of metal: ");
                            String typeOfMetal = scanner.nextLine();
                            System.out.println("Please, choose weight: ");
                            double weightOfMetal = scanner.nextDouble();
                            active = new PreciousMetalsAcc(PreciousMetalsAcc.getTypeOfMetal(typeOfMetal), weightOfMetal);
                            break;

                        case (3):
                            System.out.println("Please, choose currency: ");
                            String currency = scanner.nextLine();
                            System.out.println("Please, choose amount: ");
                            double amountToDepositAccount = scanner.nextDouble();
                            active = new DepositAcc(getCurrency(currency), LocalDate.now(), amountToDepositAccount, getYearPercent());
                            break;

                        default:
                            System.out.println("Unreachable statement");
                            break;
                    }
                    customerActive.addActive(active);
                    System.out.println("Congratulation!" +
                            "\nThe new active was added");
                    break;

                case (4):
                    System.out.println("Actives in the bank is: " + bank.allActiveValueInBank());
                    break;

                case (5):
                    isRun = false;
                default:
                    System.out.println("Unreachable statement");
                    break;
            }
        } while (isRun);
    }
}
