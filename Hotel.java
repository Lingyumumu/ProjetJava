public class Hotel extends Batiment {

	private int nombreChambre;
	private int nombreSuite;

	private int nombreSpa;

	private int nombrePiscine;

	private int etoile;
	
	public Hotel() {
		
	}
	
	public Hotel(int nombreChambre, int nombreSuite, int nombreSpa, int etoile, int nombrePiscine) {
		super.getAdresse();
		super.getSurfaceHabitale();
		this.nombreChambre = nombreChambre;
		this.nombreSuite = nombreSuite;
		this.etoile = etoile;
		this.nombreSpa = nombreSpa;
		this.nombrePiscine = nombrePiscine;
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
	public int getNombreSpa() {return nombreSpa;}
	public int getNombrePiscine() {return nombrePiscine;}


	public void setNombreSpa(int nombreSpa) { this.nombreSpa = nombreSpa;}
	public void setNombrePiscine(int nombrePiscine) {this.nombrePiscine = nombrePiscine;}
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
		System.out.println("Adresse : " + super.getAdresse());
		System.out.println("Surface habitable : " + super.getSurfaceHabitale());
		if (etoile == 5){
			System.out.println("Nombre d'etoile : " + this.etoile);
			System.out.println("Nombre de chambre : " + this.nombreChambre);
			System.out.println("Nombre de suite : " + this.nombreSuite);
			System.out.println("Nombre de piscine : " + this.nombrePiscine+ "\n");

		}
		else if(etoile == 4){
			setNombrePiscine(1);
			System.out.println("Nombre d'etoile : " + this.etoile);
			System.out.println("Nombre de chambre : " + this.nombreChambre);
			System.out.println("Nombre de piscine : " + this.nombrePiscine);
			System.out.println("Nombre de spa : " + this.nombreSpa + "\n");
		}
		else{
			System.out.println("Nombre d'etoile : " + this.etoile);
			System.out.println("Nombre de chambre : " + this.nombreChambre + "\n");
		}
	}



	// if etoile == 5 on augmente le nombre de chambre et il y aura plusieurs suites et plusieurs piscines
	// if etoile == 4 il y aura une seule piscine et plusieurs spa


		  // Comment exprimer cette idée : il y aura plusieurs suites et plusieurs piscines ?

		  // Comment exprimer cette idée : il y aura plusieurs spa ?


	}


