package by.belhard.j2.lesson9.pre.try1;

import by.belhard.j2.lesson9.pre.try1.exceptions.InvalidAccountNameException;
import by.belhard.j2.lesson9.pre.try1.exceptions.InvalidPasswordException;

import java.util.HashMap;
import java.util.Map;

public class Banking {

	private final Map<String, Account> accountsMap = new HashMap<>();

	public Banking() {

		addAccount("123", "123");
		addAccount("124", "124");
	}

	private void addAccount(String accountName, String password) {

		if (accountsMap.containsKey(accountName))
			throw new InvalidAccountNameException();

		accountsMap.put(accountName, new Account(accountName, password));
	}

	public void updateMoney(String accountName, int amount) {

		Account account = accountsMap.get(accountName);

		account.setMoney(account.getMoney() + amount);
	}

	public void checkPassword(String accountName, String password) {

		Account account = accountsMap.get(accountName);

		if (!account.checkPassword(password))
			throw new InvalidPasswordException();
	}

	public boolean isAccountExists(String accountName) {

        return accountsMap.containsKey(accountName);
	}

	public int getMoneyAmount(String accountName) {

		return accountsMap.get(accountName).getMoney();
	}
}
