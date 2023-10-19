package tp_heritage;


	public class Employe extends salaire{
		private double Hsupp;
		private double PHsupp;

		Employe(int Martricule, String Nom, double Recrutement, double Hsupp, double PHsupp) {
			super(Martricule, Nom, Recrutement);
			this.Hsupp=Hsupp;
			this.PHsupp= PHsupp;
			
		}
		@Override
		public  String toString()
		{
			return (super.toString()+"l'heure supp:  "+Hsupp+"prix d'heure:  "+PHsupp+this.getClass().getSimpleName());
		}
		@Override
		public void affiche() 
		{
			System.out.println(toString());
			super.affiche();
		}
		@Override
		double Salaire( )
		{
			double salaire=0;
			super.Salaire();
			return salaire+Hsupp*PHsupp;
			
		}

		public double getHsupp() {
			return Hsupp;
		}

		public double getPHsupp() {
			return PHsupp;
		}

		public void setPHsupp(double pHsupp) {
			PHsupp = pHsupp;
		}

		public void setHsupp(double hsupp) {
			Hsupp = hsupp;
		}
		
	}


	


