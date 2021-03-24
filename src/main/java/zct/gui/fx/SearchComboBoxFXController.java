package zct.gui.fx;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.SearchableComboBox;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class SearchComboBoxFXController implements Initializable {

	@FXML
	SearchableComboBox<String> comboSearch;
	@FXML
	SearchableComboBox<Person> comboPerson;

	ObservableList<String> stringList = FXCollections.observableArrayList("1111", "2222", "Aaaaa", "Abbbb", "Abccc",
			"Abcdd", "Abcde", "Bbbb", "bbbb", "Cccc", "Dddd", "Eeee", "Ffff", "gggg", "hhhh", "3333");

	ObservableList<Person> personList = FXCollections.observableArrayList(new Person("Jack Nicholson"),
			new Person("Marlon Brando"), new Person("Robert De Niro"), new Person("Al Pacino"),
			new Person("Daniel Day-Lewis"), new Person("Dustin Hoffman"), new Person("Tom Hanks"),
			new Person("Anthony Hopkins"), new Person("Paul Newman"), new Person("Denzel Washington"),
			new Person("Spencer Tracy"), new Person("Laurence Olivier"), new Person("Jack Lemmon"),
			new Person("Jeff Bridges"), new Person("James Stewart"), new Person("Sean Penn"),
			new Person("Michael Caine"), new Person("Morgan Freeman"), new Person("Robert Duvall"),
			new Person("Gene Hackman"), new Person("Clint Eastwood"), new Person("Gregory Peck"),
			new Person("Robin Williams"), new Person("Ben Kingsley"), new Person("Philip Seymour Hoffman"));

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboSearch.setItems(stringList);
		comboPerson.setItems(personList);
	}

	private static class Person {
		public String name;

		public Person(String string) {
			name = string;
		}

		@Override
		public String toString() {
			return name;
		}
	}

}
