package by.belhard.j2.lesson9.pre.try1;

import by.belhard.j2.lesson9.pre.try1.exceptions.InvalidInputException;
import by.belhard.j2.lesson9.pre.try1.exceptions.InvalidPasswordException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {

    private final BufferedReader reader;
    private final String LEGEND;
    private final Banking banking;

    public ATM() {

        reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        sb.append("Выберите команду:\n")
                .append("0. Узнать баланс\n")
                .append("1. Пополнить счет\n")
                .append("2. Снять деньги\n")
                .append("3. Перевести деньги\n")
                .append("e. Выйти\n");

        LEGEND = sb.toString();

        banking = new Banking();
    }

    public void startWork() {

        String validAccount = "";
        int amount;
        char c = 'e';

        try {
            while (true) {

                if (c == 'e')
                    validAccount = loginProcedure();

                printLegend();

                try {
                    c = askForInput();
                } catch (InvalidInputException e) {
                    System.err.println("Такой команды нет!");
                    c = '_';
                    continue;
                }

                switch (c) {
                    case '0':
                        System.out.printf("Баланс счета %s = %d$\n", validAccount, banking.getMoneyAmount(validAccount));
                        break;
                    case '1':
                        System.out.println("Введите сумму:");
                        banking.updateMoney(validAccount, Integer.parseInt(reader.readLine()));
                        break;
                    case '2':
                        System.out.println("Введите сумму:");
                        if ((amount = Integer.parseInt(reader.readLine())) <= banking.getMoneyAmount(validAccount))
                            banking.updateMoney(validAccount, -amount);
                        else
                            System.err.println("Недостаточно денег!");
                        break;
                    case '3':
                        System.out.println("Введите счет получателя:");
                        String receiver = reader.readLine();
                        if (banking.isAccountExists(receiver)) {
                            System.out.println("Введите сумму:");
                            amount = Integer.parseInt(reader.readLine());
                            if (amount >= 0 && banking.getMoneyAmount(validAccount) - amount >= 0) {
                                banking.updateMoney(validAccount, -amount);
                                banking.updateMoney(receiver, amount);
                            }
                        } else
                            System.err.println("Такого счета не существует!");
                        break;
                    case 'e':
                        System.out.println("Good bye!");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong =(");
        }
    }

    private String loginProcedure() throws IOException {

        String account;

        while (true) {
            System.out.println("Введите номер счета:");
            account = reader.readLine();
            if (!banking.isAccountExists(account)) {
                System.out.println("Такого счета не существует.");
                continue;
            }

            System.out.println("Введите пароль:");
            try {
                banking.checkPassword(account, reader.readLine());
            } catch (InvalidPasswordException e) {
                System.out.println("Неправильно введен пароль!");
                continue;
            }

            return account;
        }
    }

    private void printLegend() {

        System.out.println(LEGEND);
    }

    private char askForInput() throws IOException {

        String s = reader.readLine();

        if (s.length() != 1 && !s.matches("[0123e]"))
            throw new InvalidInputException();

        return s.charAt(0);
    }

}
