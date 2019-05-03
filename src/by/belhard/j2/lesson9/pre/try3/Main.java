package by.belhard.j2.lesson9.pre.try3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	// реализация сортировки с компаратором
	public static void main(String[] args) {

		BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<>();

		try {
			int n = Integer.parseInt(rdr.readLine());

			for (int i = 0; i < n; i++)
				list.add(rdr.readLine());

			list.sort(Comparator.naturalOrder());

			System.out.println(list);

		} catch (Exception e) {
			System.out.println("Wrong input");
		}
	}

}
