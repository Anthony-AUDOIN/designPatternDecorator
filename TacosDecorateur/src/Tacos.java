
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
			return "Le tacos "+this.description+" co�te "+this.prix+" euros.";
		}
}

