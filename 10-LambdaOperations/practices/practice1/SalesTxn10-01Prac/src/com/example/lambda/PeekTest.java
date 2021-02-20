package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class PeekTest {

	public static void main(String[] args) {

		List<SalesTxn> tList = SalesTxn.createTxnList();
		Consumer<SalesTxn> taxReport = t -> System.out.printf(
				"Id: " + t.getTxnId() + " Buyer: " + t.getBuyerName() + " Txn amt: $%,9.2f%n", t.getTransactionTotal());

		// Write report using peek

		System.out.println("=== Widget Pro Sales Tax in CA ===");
		tList.stream().filter(t -> t.getState().equals(State.CA))
		.filter(t -> t.getProduct().equals("Widget Pro"))
		.peek(t -> System.out.println(" Id " + t.getTxnId() + " Buyer: " + t.getBuyerName() + " Txn amt: "
						+ t.getTransactionTotal() + " Txn taxes " + t.getTaxRate()))
				.map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState())).peek(t -> System.out.println(t))
				.forEach(t -> System.out.printf("Txn tax: $%,9.2f%n", t));

	}
}
