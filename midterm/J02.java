class Dates {			//(1)
	String[] weeks = new String[7];
	
	public Dates() {				//(2) constructor
		weeks[0] = "Sun";
		weeks[1] = "Mon";
		weeks[2] = "Thu";
		weeks[3] = "Wed";
		weeks[4] = "Tus";
		weeks[5] = "Fri";
		weeks[6] = "Sat";
	}
	
	public String askDate(int day) {			//(3)method
		if(day >= 1 && day <= 7)
			return weeks[day % 7];
		return "Wrong day";
	}
}

public class J02 {
	public static void main(String[] argv) {
		Dates aDate = new Dates();		// create object
		for(int i = 1;i <= 7;i++)
			System.out.println(aDate.askDate(i));			//(3)call method
	}
}