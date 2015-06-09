package org.azizur.banking.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.azizur.banking.model.Account;
import org.azizur.banking.model.AccountDao;

// This is a In-Memory Implementation of Database Access Objects

public class AccountDaoImpl implements AccountDao {

	private Map<Long, Account> inMemoryDatabase = new HashMap<Long, Account>();
	{
		// Create a set of account
		Account account1 = new Account(1L, "Azizur", 10000.00);
		Account account2 = new Account(2L, "Maruf", 10000.00);
		Account account3 = new Account(3L, "Aariz", 10000.00);
		Account account4 = new Account(4L, "Masum", 10000.00);
		Account account5 = new Account(5L, "Rabby", 10000.00);
		inMemoryDatabase.put(account1.getId(), account1);
		inMemoryDatabase.put(account2.getId(), account2);
		inMemoryDatabase.put(account3.getId(), account3);
		inMemoryDatabase.put(account4.getId(), account4);
		inMemoryDatabase.put(account5.getId(), account5);

	}

	@Override
	public void insert(Account account) {
		long id;
		id = inMemoryDatabase.size() + 1;
		inMemoryDatabase.put(id, account);

	}

	@Override
	public void update(Account account) {
		inMemoryDatabase.put(account.getId(), account);
	}

	@Override
	public void update(List<Account> accountLists) {
		Iterator<Account> aIterator = accountLists.iterator();
		while (aIterator.hasNext()) {
			Account account = aIterator.next();
			inMemoryDatabase.put(account.getId(), account);
		}
	}

	@Override
	public Account find(long accountId) {
		return inMemoryDatabase.get(accountId);

	}

	@Override
	public List<Account> find(List<Long> accountIds) {
		List<Account> accountList = new ArrayList<Account>();
		for (long aId : accountIds) {
			Account account = find(aId);
			accountList.add(account);
		}

		return accountList;
	}

	@Override
	public List<Account> find(String accountName) {
		List<Account> accountList = new ArrayList<Account>();
		for (Map.Entry<Long, Account> entry : inMemoryDatabase.entrySet()) {
			Account account = entry.getValue();

			if (account.getAccountName() == accountName) {
				accountList.add(account);
			}

		}

		return accountList;
	}

	@Override
	public List<Account> find(boolean active) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long accountId) {
		inMemoryDatabase.remove(accountId);

	}

}
