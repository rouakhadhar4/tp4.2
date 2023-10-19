package tp_heritage;

public class vendeur extends salaire {
	private double Vente;
	private double Pourcentage;
	vendeur(int matricule, String  nom,double  recrutement,	double vente,double Pourcentage)
	{
		super(matricule,nom,recrutement);
		this.Vente=vente;
		this.Pourcentage=Pourcentage;
		
		
	}
	public double getPourcentage() {
		return Pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		Pourcentage = pourcentage;
	}
	public double getVente() {
		return Vente;
	}
	public void setVente(double vente) {
		Vente = vente;
	}
	public String toString() {
        return super.toString()+"le vende de vendeur:  " + Vente + " leporcentage du vendeur:  " +Pourcentage ;
	
        
	}
	public void affiche()
	{
		
		System.out.println(toString()+this.getClass().getSimpleName());
		super.affiche();
		
	}
	double Salaire( )
	{
		double salaire=0;
		salaire=super.Salaire()+(Vente* Pourcentage);
		return salaire;
		
		
		
	}
	
	

}
