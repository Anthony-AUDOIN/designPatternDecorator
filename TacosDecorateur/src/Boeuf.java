
public class Boeuf extends Decorateur {

	Tacos tacos;
	public Boeuf(Tacos tacos) {
		this.tacos=tacos;
	}

	@Override
	public String getDescription() {
		return tacos.getDescription()+" boeuf";
	}

	@Override
	public Double getPrix() {
		return this.prix;
	}

}
