package by.belhard.j2.lesson9.pre.try1;

import by.belhard.j2.lesson9.pre.try1.exceptions.InvalidAccountNameException;
import by.belhard.j2.lesson9.pre.try1.exceptions.InvalidPasswordException;

import java.util.HashMap;
import java.util.Map;

public class Banking {

	private final Map<String, Account> accounts = new HashMap<>();

	public Banking() {

		addAccount("123", "123");
		addAccount("124", "124");
	}

	private void addAccount(String accountName, String password) {

		if (accounts.containsKey(accountName))
			throw new InvalidAccountNameException();

		accounts.put(accountName, new Account(accountName, password));
	}

	public void updateMoney(String accountName, int amount) {

		Account account = accounts.get(accountName);

		account.setMoney(account.getMoney() + amount);
	}

	public void checkPassword(String accountName, String password) {

		Account account = accounts.get(accountName);

		if (!account.checkPassword(password))
			throw new InvalidPasswordException();
	}

	public boolean isAccountExists(String accountName) {

		return accounts.containsKey(accountName);
	}

	public int getMoneyAmount(String accountName) {

		return accounts.get(accountName).getMoney();
	}
}
