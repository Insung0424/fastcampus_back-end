package ch14;

public class takeTest {

	public static void main(String[] args) {
		Student studentJames = new Student("James",5000);
		Student studentTomas = new Student("Tomas",5000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		studentJames.takeBus(bus500);
		
		Subway subway1 = new Subway(2);
		studentTomas.takeSubway(subway1);
		
		Taxi taxi2 = new Taxi("normal");
		studentJames.takeTaxi(taxi2);
		
		studentJames.showInfo();
		studentTomas.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		subway1.showSubwayInfo();
		taxi2.showTaxiInfo();
	}

}
