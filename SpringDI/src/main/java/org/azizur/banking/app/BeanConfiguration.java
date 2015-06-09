package org.azizur.banking.app;

import org.azizur.banking.Dao.AccountDaoImpl;
import org.azizur.banking.model.AccountDao;
import org.azizur.banking.model.AccountService;
import org.azizur.banking.services.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Java-based bean definition


@Configuration
public class BeanConfiguration {
	
	@Bean
	public AccountService accountService(){
		AccountServiceImpl bean=new AccountServiceImpl();
		bean.setAccountDao(accountDao());
		return bean;
	}
	
	@Bean
	public AccountDao accountDao(){
		AccountDaoImpl bean=new AccountDaoImpl();
		return bean;
	}
}
