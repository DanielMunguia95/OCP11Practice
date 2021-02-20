package com.example.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class SortTest {

    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> transReport
                = t -> System.out.printf("Id: " + t.getTxnId()
                        + " Seller: " + t.getSalesPerson() + " Buyer: "
                        + t.getBuyerName() + " Amt: $%,9.2f%n", t.getTransactionTotal());

        // Print out PriceCo Transactions
        System.out.println("=== PriceCo Transactions ===");

        tList.stream().filter(t -> t.getBuyerName().equals("PriceCo"))
                .sorted(Comparator.comparing(SalesTxn::getTransactionTotal)).forEach(t -> transReport.accept(t));

        System.out.println("\n=== PriceCo Transactions Reversed ===");
        tList.stream().filter(t -> t.getBuyerName().equals("PriceCo"))
                .sorted(Comparator.comparing(SalesTxn::getTransactionTotal)).forEach(t -> transReport.accept(t));

        // Sort by Buyer, SalesPerson, Transaction Total
        System.out.println("\n=== Triple Sort Transactions ===");
        tList.stream().filter(t -> t.getBuyerName().equals("PriceCo"))
                .sorted(Comparator.comparing(SalesTxn::getSalesPerson)).forEach(t -> transReport.accept(t));

    }
}
