package org.azizur.banking.model;

import java.util.List;

public interface AccountDao {
	public void insert(Account account);
	public void update (Account account);
	public void update(List<Account> accountLists);
	
	public Account find(long accountId);
	public List<Account> find(List<Long> accountIds);
	public List<Account> find(String accountName);
	public List<Account> find(boolean active);
	
	
	public void delete(long accountId);
	
	

}
