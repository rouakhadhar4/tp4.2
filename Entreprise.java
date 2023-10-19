package tp_heritage;

public class Entreprise {

	public static void main(String[] args) {
	        salaire tabsalaire[]  = new salaire[5];
	        Employe e1 = new Employe(12345,"Walid",2002,15,4);
			vendeur e2= new vendeur(23445,"Yessine",2007,1000,0.1);
			vendeur v1=new vendeur(65478,"Nassime",2000,700,0.1);
			Employe e3 =new Employe(87698,"Aymen ",2003,19,5);
			Employe e4=new Employe(12345,"Khaled",2008,7,4);
			tabsalaire[0]=e1;
			tabsalaire[1]=e2;
			tabsalaire[2]=v1;
			tabsalaire[3]=e3;
			tabsalaire[4]=e4;
			//e3.getVente();test incorrect
			System.out.println("la listes des  vendeur: ");
			
			
			for (int i = 0; i < tabsalaire.length; i++) {
				if(tabsalaire[i] instanceof vendeur)
					tabsalaire[i].affiche();
		    }
			System.out.println(" la listes des l'employe: ");
			for (int i = 0; i < tabsalaire.length; i++) {
				if(tabsalaire[i] instanceof Employe)
					tabsalaire[i].affiche();
		    }
			for (int i = 0; i < tabsalaire.length; i++) {
				{
					
					double min=tabsalaire[0].recrutement;
					if(tabsalaire[i].recrutement<min)
						System.out.println("la nom du salarie le plus ancien de l'entreprise:  "+tabsalaire[i].nom +" recruté en l'an"+tabsalaire[i].recrutement);
						
				}
				
			}
			/*salaire s =tabsalaire[0];
			for (int i = 0; i < tabsalaire.length; i++) {
				
				{
					
					if(tabsalaire[i].Salaire()>s.Salaire())
						s=tabsalaire[i];
						
				}
				
				
			}
			System.out.println("Matricule du vendeur disposant du plus grand salaire : "+s.getmatricule()+  " le salaire"+s.Salaire());
			
					
						
						
						
				}*/
			//min tableau vendeur
			
			salaire Smax = null;
			for(int i=0;i<tabsalaire.length;i++) {
				if(tabsalaire[i] instanceof vendeur) {
					if(Smax == null) {
						Smax=tabsalaire[i];
					}
					else 
					{
						if(Smax.Salaire() < tabsalaire[i].Salaire()) {
							Smax=tabsalaire[i];
						}
					}
				}
			}
			System.out.println("le matricule du vendeur qui a le plus grand salaire "+Smax.matricule +" qui a comme salaire = "+Smax.Salaire());
	

}
}



			
			
			
			
			
			
			
			
			

			
			
		
			
			
			
		

	


