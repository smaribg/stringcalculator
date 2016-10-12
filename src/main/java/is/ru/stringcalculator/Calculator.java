package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(emptyString(text))
			return 0;
		else
			return -1;
	}

	private static boolean emptyString(String text){
		return (text == " ");
	}
}