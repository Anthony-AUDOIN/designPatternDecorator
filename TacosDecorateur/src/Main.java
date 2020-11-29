
public class Main {

	public static void main(String[] args) {
		
		Tacos tacos =new Tacos1Viande("",0.0);
		tacos=new Boeuf(tacos);
		tacos=new Ketchup(tacos);
		
		Tacos tacos2=new Tacos2Viandes("",0.0);
		tacos2= new Boeuf(tacos2);
		tacos2=new Poulet(tacos2);
		tacos2=new Mayonnaise(tacos2);
		
		System.out.println("Le "+tacos.getDescription()+ " coûte "+tacos.getPrix());
		System.out.println("Le "+tacos2.getDescription()+ " coûte "+tacos2.getPrix());
				

	}

}
