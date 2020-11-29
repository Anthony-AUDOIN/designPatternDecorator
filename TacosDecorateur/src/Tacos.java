
public abstract class Tacos {
		protected String description= null;
		protected double prix;
		
		public String getDescription() {
			return this.description;
		}
		
		public Double getPrix() {
			return this.prix;
		}
		
		public String toString() {
			return "Le tacos "+this.description+" coûte "+this.prix+" euros.";
		}
}

