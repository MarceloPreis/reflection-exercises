package reflextionExercise;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StringValidate strVal = new StringValidate();
		Scanner in = new Scanner(System.in);

		System.out.println("Informe o parametro: ");
		String newStr = strVal.processString(in.next());

		if (newStr != null) {
			Object o = new ObjBuilder(new Instance(newStr).get()).build();
			System.out.println(o.toString());
		} else {
			System.out.println("String inválida");
		}

		in.close();
	}

}
