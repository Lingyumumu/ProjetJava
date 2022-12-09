public class Hotel extends Batiment {

	private int nombreChambre;
	private int nombreSuite;

	private int nombreSpa;

	private int etoile;
	
	public Hotel() {
		
	}
	
	public Hotel(int nombreChambre, int nombreSuite, int nombreSpa, int etoile) {
		super.getAdresse();
		super.getSurfaceHabitale();
		this.nombreChambre = nombreChambre;
		this.nombreSuite = nombreSuite;
		this.etoile = etoile;
	}

	public int getNombreChambre() {
		return nombreChambre;
	}
	public int getNombreSuite() {
		return nombreSuite;
	}
	public int getEtoile() {
		return etoile;
	}

	public void setEtoile(int etoile) {
		this.etoile = etoile;
	}

	public void setNombreSuite(int nombreSuite) {
		this.nombreSuite = nombreSuite;
	}

	public void setNombreChambre(int nombreChambre) {
		this.nombreChambre = nombreChambre;
	}


	public void affiche(){
		if (etoile == 5){
			System.out.println("Nombre d'etoile : " + this.etoile);
			System.out.println("Nombre de chambre : " + this.nombreChambre);
			System.out.println("Nombre de suite : " + this.nombreSuite);

		}
		else if(etoile == 4){
			System.out.println("Nombre d'etoile : " + this.etoile);
			System.out.println("Nombre de chambre : " + this.nombreChambre);
			System.out.println("Nombre de suite : " + this.nombreSuite);
		}
		else{
			System.out.println("Nombre d'etoile : " + this.etoile);
			System.out.println("Nombre de chambre : " + this.nombreChambre);
		}
	}



	// if etoile == 5 on augmente le nombre de chambre et il y aura plusieurs suites et plusieurs piscines
	// if etoile == 4 il y aura une seule piscine et plusieurs spa


		  // Comment exprimer cette idée : il y aura plusieurs suites et plusieurs piscines ?

		  // Comment exprimer cette idée : il y aura plusieurs spa ?


	}


