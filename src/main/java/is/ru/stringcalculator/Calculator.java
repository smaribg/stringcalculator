package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(emptyString(text)){
			return 0;
		}
		else if(text.contains(",")){
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
		return toInt(numbers[0]) + toInt(numbers[1]);
	}

	private static String[] splitText(String text){
		return text.split(",");
	}

}