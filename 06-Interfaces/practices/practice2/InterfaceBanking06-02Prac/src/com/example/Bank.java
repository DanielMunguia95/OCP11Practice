package com.example;

public class Bank implements BankOperations {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    @Override
    public void addCustomer(String f, String l, Branch b) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l, b);
    }

    @Override
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    @Override
    public Customer getCustomer(int customerIndex) {
        return customers[customerIndex];
    }

    @Override
    public void generateReport() {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int custIndex = 0; custIndex < getNumOfCustomers(); custIndex++) {
            Customer customer = getCustomer(custIndex);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName()
                    + "\nBranch: " + customer.getBranch() + ", "
                    + customer.getBranch().getServiceLevel());

            // For each account for this customer...
            for (int acctIndex = 0; acctIndex < customer.getNumOfAccounts(); acctIndex++) {
                Account account = customer.getAccount(acctIndex);

                // Print the current balance of the account
                System.out.println("    " + account);
            }
        }
    }

}
