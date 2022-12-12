package reflextionExercise;

public class StringValidate {
	
	public String processString(String str) {
		str = str.replace("/", "");
		str = str.substring(0, 1).toUpperCase() +  str.substring(1) + "Controller"; 
		
		if(str.length() < 2 || str.isBlank()) 
			return null;

		return str;
	}
	
	
}
