
public class Mayonnaise extends Decorateur {

	Tacos tacos;
	public Mayonnaise(Tacos tacos) {
		this.tacos=tacos;
	}

	@Override
	public String getDescription() {
		return tacos.getDescription()+" mayonnaise";
	}

	@Override
	public Double getPrix() {
		return tacos.prix;
	}

}