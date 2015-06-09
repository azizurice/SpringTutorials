package org.azizur.banking.app;

import org.azizur.banking.model.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class YourBank {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		AccountService accountService = applicationContext.getBean(
				"accountService", AccountService.class);

		System.out.println("Before : Money Transfer");
		for (long i = 1; i <= 5; i++) {
			System.out.println("Account " + i + " balance :"
					+ accountService.getAccount(i).getAccountBalance());
		}
		
		accountService.transferMoney(1, 2, 500);

		System.out.println("After : Money Transfer");

		for (long i = 1; i <= 5; i++) {
			System.out.println("Account " + i + " balance :"
					+ accountService.getAccount(i).getAccountBalance());

		}
		applicationContext.close();

	}
}
