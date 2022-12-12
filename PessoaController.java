package reflextionExercise;

public class PessoaController {
	private Pessoa pessoa;
	
	public PessoaController() {
		this.pessoa = new Pessoa();
	}
	
	@Override
	public String toString() {
		return this.pessoa.toString();
	}
}
