package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(emptyString(text))
			return 0;
		else
			return Integer.parseInt(text);
	}

	private static boolean emptyString(String text){
		return (text == " ");
	}
}