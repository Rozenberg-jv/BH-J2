package by.belhard.j2.lesson9.pre.try1;


import java.util.Objects;

public class Account {

	private String accountName;

	private String password;

	private int money;

	public Account(String accountName, String password) {

		this.accountName = accountName;
		this.password = password;
		this.money = 0;
	}

	public void setMoney(int money) {

		this.money = money;
	}

	public int getMoney() {

		return money;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Account))
			return false;
		Account account = (Account) o;
		return money == account.money && accountName.equals(account.accountName) && password.equals(account.password);
	}

	@Override
	public int hashCode() {

		return Objects.hash(accountName, password, money);
	}

	public boolean checkPassword(String password) {

		return this.password.equals(password);
	}
}
