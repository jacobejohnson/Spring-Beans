package beans;

public class AccountServiceImpl implements AccountService{
	
	private AccountDao accountDao;
	
	public AccountDao getAccount() {
		return accountDao;
	}
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao=accountDao;
	}
	
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Account sourceAccount = accountDao.find(sourceAccountId);
		Account targetAccount = accountDao.find(targetAccountId);
		
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		targetAccount.setBalance(targetAccount.getBalance() + amount);
		
		accountDao.update(sourceAccount);
		accountDao.update(targetAccount);
	}
	
	public Account getAccount(long accountId){
		return accountDao.find(accountId);
	}
	

}
