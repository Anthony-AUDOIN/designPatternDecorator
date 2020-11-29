
public class Ketchup extends Decorateur {

	Tacos tacos;
	public Ketchup(Tacos tacos) {
		this.tacos=tacos;
	}

	@Override
	public String getDescription() {
		return tacos.getDescription()+" ketchup";
	}

	@Override
	public Double getPrix() {
		return tacos.prix;
	}

}
