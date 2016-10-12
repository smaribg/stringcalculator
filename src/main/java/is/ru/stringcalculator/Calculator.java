package is.ru.stringcalculator;

public class Calculator{

	public static int add(String text){
		if(emptyString(text)){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n")){
			validate(splitText(text));
			return sum(splitText(text));
		}
		else{
			validate(text);
			return toInt(text);
		}
	}

	private static boolean emptyString(String text){
		return (text == " ");
	}

	private static int toInt(String text){
		int n = Integer.parseInt(text);
		if(n > 1000){
			return 0;
		}
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

	private static void validate(String number){
		if(toInt(number) < 0)
			throw new IllegalArgumentException("Negatives not allowed: " + number);
	}
	private static void validate(String [] numbers){
		String negatives = "";
		for(String n : numbers){
			if(toInt(n) < 0){
				negatives = negatives + n + ",";
			}
		}
		if(negatives != ""){
			negatives = negatives.substring(0,negatives.length()-1);
			throw new IllegalArgumentException("Negatives not allowed: " + negatives);
		}
	}
}