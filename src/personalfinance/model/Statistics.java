package personalfinance.model;

import personalfinance.saveload.SaveData;

import java.util.HashMap;
import java.util.List;

public class Statistics {

	public static double getBalanceCurrency(Currency currency) {
		SaveData sd = SaveData.getInstance();
		double amount = 0;
		for (Account account : sd.getAccounts()) {
			if (currency.equals(account.getCurrency())) amount += account.getAmount();
		}
		return amount;
	}

	public static double getBalance(Currency currency) {
		SaveData sd = SaveData.getInstance();
		double amount = 0;
		for (Account account : sd.getAccounts()) {
			amount += account.getAmount() * account.getCurrency().getRateByCurrency(currency);
		}
		return amount;
	}

	public static HashMap<String, Double> getDataForChartOnIncomeArticles() {
		return getDataForChartOnArticles(true);
	}

	public static HashMap<String, Double> getDataForChartOnExpArticles() {
		return getDataForChartOnArticles(false);
	}

	private static HashMap<String, Double> getDataForChartOnArticles(boolean income) {
		SaveData sd = SaveData.getInstance();
		HashMap<String, Double> data = new HashMap<>();
		List<Transaction> transactions = sd.getTransactions();
		for (Transaction t : transactions) {
			double tAmount = t.getAmount();
			if ((income && tAmount > 0) || (!income && tAmount < 0)) {
				String key = t.getArticle().getTitle();
				double sum = 0;
				double amount = tAmount;
				if (!income) amount *= -1;

				if (data.containsKey(key)) sum = data.get(key);
				sum += amount * t.getAccount().getCurrency().getRateByCurrency(sd.getBaseCurrency());
				data.put(key, round(sum));
			}
		}
		return data;
	}

	private static double round(double value) {
		return (double) Math.round(value * 100) / 100;
	}
}
