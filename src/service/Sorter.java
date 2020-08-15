package service;

import equipment.Armor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Можно еще назвать ArmorSorter
public class Sorter {

	//Если у тебя этот метод должен взять всю броню из ценного диапазона 1000 - 8000 это скорее фильтр а не сортировка
	//Но можно сделать так чтобы он выбрал только от 1к до 8к и отсортировал от меньшего к большему, как сделал я здесь:
	//На мой взгляд здесь более логично, но программирование такая штука что это спорный момент
	public static List<Armor> sortByPriceInRange (List<Armor> armors, int startPrice, int endPrice) {

		List<Armor> filteredArmors = new ArrayList<>();
		for (Armor armor : armors) {
			if (armor.getPrice() > startPrice && armor.getPrice() < endPrice) {
				filteredArmors.add(armor);
			}
		}
		//в комментарии ниже написано что за компаратор такой я сделал здесь:
		//https://www.baeldung.com/java-8-comparator-comparing можешь ознакомится с этой статьей
		filteredArmors.sort(Comparator.comparingInt(Armor::getPrice));
		return filteredArmors;
	}

	//Можно использовать "функциональный стиль" и не писать компоратор отдельно, а пропихивать его как сделал я.
	//То есть можно прям в классе Main сделать сортировку, но по ООП (это цель задания) мы создали отдельный сервис
	//который за это отвечает и просто перенесли логику сюда, чтобы ты общался с объектом "сортировщик" и говорил ему
	//слышь бля просортируй, типа более логично и по ООПешнему (но опять таки можно с этим поспорить)
	public static List<Armor> sortByWeight (List<Armor> armors) {
		armors.sort(Comparator.comparingInt(Armor::getWeight));
		return armors;
	}

}
