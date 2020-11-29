
public class Poulet extends Decorateur {

	Tacos tacos;
	public Poulet(Tacos tacos) {
		this.tacos=tacos;
	}

	@Override
	public String getDescription() {
		return tacos.getDescription()+" poulet";
	}

	@Override
	public Double getPrix() {
		return tacos.prix;
	}

}