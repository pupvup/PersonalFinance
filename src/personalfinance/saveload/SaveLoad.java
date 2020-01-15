package personalfinance.saveload;

import personalfinance.settings.Settings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class SaveLoad {

	public static void load(SaveData data) {

		try {
			JAXBContext context = JAXBContext.newInstance(Wrapper.class);
			Unmarshaller um = context.createUnmarshaller();
			Wrapper wrapper = (Wrapper) um.unmarshal(Settings.getFileSave());

			data.setAccounts(wrapper.getAccounts());
			data.setArticles(wrapper.getArticles());
			data.setCurrencies(wrapper.getCurrencies());
			data.setTransactions(wrapper.getTransactions());
			data.setTransfers(wrapper.getTransfers());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void save(SaveData data) {
		try {
			JAXBContext context = JAXBContext.newInstance(Wrapper.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			Wrapper wrapper = new Wrapper();

			wrapper.setAccounts(data.getAccounts());
			wrapper.setArticles(data.getArticles());
			wrapper.setTransactions(data.getTransactions());
			wrapper.setTransfers(data.getTransfers());
			wrapper.setCurrencies(data.getCurrencies());

			m.marshal(wrapper, Settings.getFileSave());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
