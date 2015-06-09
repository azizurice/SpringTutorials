package org.azizur.banking.services;

import org.azizur.banking.model.Account;
import org.azizur.banking.model.AccountDao;
import org.azizur.banking.model.AccountService;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transferMoney(long sourceAcccountId, long destAccountId,
			double amount) {
		Account sourceAccount = accountDao.find(sourceAcccountId);
		Account targetAccount = accountDao.find(destAccountId);
		if (amount <= sourceAccount.getAccountBalance()) {
			sourceAccount.setAccountBalance(sourceAccount.getAccountBalance()
					- amount);
			targetAccount.setAccountBalance(targetAccount.getAccountBalance()
					+ amount);

			// Update database.
			
			accountDao.update(sourceAccount);
			accountDao.update(targetAccount);

		} else {
			System.out.println(" Sorry!,The account does not have enough balanced");
		}

	}

	@Override
	public void depositeMoney(long accountId, double amount) {
		Account account=accountDao.find(accountId);
		account.setAccountBalance(account.getAccountBalance()+amount);
		accountDao.update(account);
	}

	@Override
	public Account getAccount(long accountId) {
		
		return accountDao.find(accountId);
	}

}
