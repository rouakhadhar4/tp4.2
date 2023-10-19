package tp_heritage;

public class salaire {
	protected int matricule;
	protected String  nom;
	protected double  recrutement;
	salaire(int matricule, String  nom,double  recrutement )
	{
		this.matricule=matricule;
		this.nom=nom;
		this.recrutement=recrutement;
	}
	int getmatricule()
	{
		return matricule;
	}
    String getnom()
	{
		return nom;
	}
	double getrecrutement()
	{
		return recrutement;
	}
	public void setmatricule(int m)
	{
		 this.matricule=m;
	}
	public void setnom(String m)
	{
		 this.nom=m;
	}
	public void set(double r)
	{
		 this.recrutement=r;
	}
	@Override
    public String toString() {
        return "le nom du salarie:  " + nom + " la matricule:   " + matricule + "son recrutement:  " +recrutement; 
    }
	public void affiche()
	{
		System.out.println(toString());
	}
	double Salaire( )
	{
		double salaire=0;
		if(this.recrutement<2005)
		{
			salaire=400;
		}
		else
		{
			salaire=280;
			
			
		}
		return salaire;
	}
	
	
	
	



}
