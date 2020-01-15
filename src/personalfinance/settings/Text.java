package personalfinance.settings;

import java.util.Calendar;
import java.util.HashMap;

final public class Text {
	private static HashMap<String, String> data = new HashMap<>();

	public static String get (String key) {
		if (data.containsKey(key)) return data.get(key);
		System.out.println("Ключа не существует!");
		return "";
	}

	public static String[] getMonths() {
		String[] months = new String[12];
		months[0] = get("JANUARY");
		months[1] = get("FEBRUARY");
		months[2] = get("MARCH");
		months[3] = get("APRIL");
		months[4] = get("MAY");
		months[5] = get("JUNE");
		months[6] = get("JULY");
		months[7] = get("AUGUST");
		months[8] = get("SEPTEMBER");
		months[9] = get("OCTOBER");
		months[10] = get("NOVEMBER");
		months[11] = get("DECEMBER");

		return months;
	}
	public static void init() {
		data.put("PROGRAMM_NAME", "Домашняя бухгалтерия");
		data.put("MENU_FILE", "Файл");
		data.put("MENU_EDIT", "Правка");
		data.put("MENU_VIEW", "Вид");
		data.put("MENU_HELP", "Помощь");

		data.put("JANUARY", "Январь");
		data.put("FEBRUARY", "Февраль");
		data.put("MARCH", "Март");
		data.put("APRIL", "Апрель");
		data.put("MAY", "Май");
		data.put("JUNE", "Июнь");
		data.put("JULY", "Июль");
		data.put("AUGUST", "Август");
		data.put("SEPTEMBER", "Сентябрь");
		data.put("OCTOBER", "Октябрь");
		data.put("NOVEMBER", "Ноябрь");
		data.put("DECEMBER", "Декабрь");

		data.put("ERROR", "Ошибка!");
		data.put("ERROR_TITLE_EMPTY", "Пустой заголовок!");
		data.put("ERROR_EXISTS", "Такая запись уже существует!");
		data.put("ERROR_DATE_FORMAT", "Неверный формат даты!");
		data.put("ERROR_CODE_EMPTY", "Код не указан!");
		data.put("ERROR_CURRENCY_EMPTY", "Валюта не указана!");
		data.put("ERROR_ARTICLE_EMPTY", "Статья не указана!");
		data.put("ERROR_ACCOUNT_EMPTY", "Счет не указан!");
		data.put("ERROR_RATE_INCORRECT", "Неверное значение курса!");
		data.put("ERROR_AMMOUNT_FORMAT", "Неверный формат суммы!");
		data.put("ERROR_NO_BASE_CURRENCY", "Необходима базовая валюта!");

		data.put("MENU_FILE_NEW", "Новый");
		data.put("MENU_FILE_OPEN", "Открыть");
		data.put("MENU_FILE_SAVE", "Сохранить");
		data.put("MENU_FILE_UPDATE_CURRENCIES", "Обновить курс");
		data.put("MENU_FILE_EXIT", "Выход");

		data.put("MENU_EDIT_ADD", "Добавить");
		data.put("MENU_EDIT_EDIT", "Редактировать");
		data.put("MENU_EDIT_DELETE", "Удалить");

		data.put("MENU_VIEW_OVERVIEW", "Просмотр");
		data.put("MENU_VIEW_ACCOUNTS", "Счета");
		data.put("MENU_VIEW_ARTICLES", "Статьи");
		data.put("MENU_VIEW_TRANSACTIONS", "Транзакции");
		data.put("MENU_VIEW_TRANSFERS", "Переводы");
		data.put("MENU_VIEW_CURRENCIES", "Валюты");
		data.put("MENU_VIEW_STATISTICS", "Статистика");
		data.put("MENU_HELP_ABOUT", "Помощь");

		data.put("TOOLBAR_OVERVIEW", "Просмотр");
		data.put("TOOLBAR_ACCOUNTS", "Счета");
		data.put("TOOLBAR_ARTICLES", "Статьи");
		data.put("TOOLBAR_CURRENCIES", "Валюты");
		data.put("TOOLBAR_STATISTICS", "Статистика");
		data.put("TOOLBAR_TRANSFERS", "Переводы");
		data.put("TOOLBAR_TRANSACTIONS", "Транзакции");

		data.put("ADD", "Добавить");
		data.put("EDIT", "Править");
		data.put("DELETE", "Удалить");

		data.put("TODAY", "Сегодня");

		data.put("YES", "Да");
		data.put("NO", "Нет");

		data.put("FC_OPEN", "Открыть");
		data.put("FC_SAVE", "Сохранить");
		data.put("FC_CANCEL", "Отмена");
		data.put("FC_LOOK", "Папка: ");
		data.put("FC_NAME_FILE", "Имя файла: ");
		data.put("FC_TYPE_FILE", "Тип файла: ");
		data.put("FC_UP", "Вверх");
		data.put("FC_NEW_DIRECTORY", "Новая папка");
		data.put("FC_LIST", "Список");
		data.put("FC_TABLE", "Таблица");
		data.put("FC_NAME", "Имя");
		data.put("FC_SIZE", "Размер");
		data.put("FC_TYPE", "Тип");
		data.put("FC_DATE", "Дата");
		data.put("FC_ATTR", "Атрибуты");
		data.put("FC_ALL_FILTER", "Все файлы");
		data.put("FC_HOME", "Домашняя директория");
		data.put("FC_SAVE_AS", "Сохранить как: ");

		data.put("DIALOG_ABOUT_TITLE", "О программе");
		data.put("ABOUT", "<body style='font-size: 120%; text-align: center; width: 360px; height: 310px;'>" +
				"<h1>Домашняя Бухгалтерия</h1><p><img src='file:images/main.png'/></p>" +
				"<p>Простой текст, вроде лорем ипсум долор." +
				"<br/>Тут вообще-то должна быть инфа про \"приложение, которое я не написала\"." +
				"<br/>Но тут просто написана какая-то дичь и ссылка на какой-то сайт: <a style='font-weigth: bold;' href='https://www.google.ru'>https://www.google.ru</a></p>" +
				"<p>Это никто даже не будет читать, так что не обязательно было ставить все запятые...</p>" +
				"<p>Copyrigth " + Calendar.getInstance().get(Calendar.YEAR) + "</p></body>");
	}
}
