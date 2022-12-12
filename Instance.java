package reflextionExercise;

public class Instance {

	private String resorce;
	
	public Instance(String resorce) {
		this.resorce = resorce;
	}

	public Class<?> get() {

		try {
			Class<?> classT = Class.forName("reflextionExercise." + resorce);
			return classT;
			
		} catch (Exception e) {
			System.out.println("Classe n�o encontrada");
		}
		return null;
	}
}
