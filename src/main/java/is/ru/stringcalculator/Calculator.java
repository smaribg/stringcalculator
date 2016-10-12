package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(emptyString(text)){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitText(text));
		}
		else{
			return toInt(text);
		}
	}

	private static boolean emptyString(String text){
		return (text == " ");
	}

	private static int toInt(String text){
		return Integer.parseInt(text);
	}

	private static int sum(String[] numbers){
		int sum = 0;
		for(String n : numbers){
			sum += toInt(n);
		}
		return sum;
	}

	private static String[] splitText(String text){
		return text.split("[, \\n]");
	}
}