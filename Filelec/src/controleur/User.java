package controleur;

public class User 
{
	private int idcli, nbFactures;
	private String nom, prenom, adresse, ville, code_postal, email, telephone, mdp;
	
	public User(int idcli, int nbFactures, String nom, String prenom, String adresse, String ville, String code_postal,
			String email, String telephone, String mdp) 
	{
		super();
		this.idcli = idcli;
		this.nbFactures = nbFactures;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.code_postal = code_postal;
		this.email = email;
		this.telephone = telephone;
		this.mdp = mdp;
	}

	public User(int idcli, String nom, String prenom, String mdp) 
	{
	super();
	this.idcli = idcli;
	this.nom = nom;
	this.prenom = prenom;
	this.mdp = mdp;
	}

	
	public int getIdcli() {
		return idcli;
	}

	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}

	public int getNbFactures() {
		return nbFactures;
	}

	public void setNbFactures(int nbFactures) {
		this.nbFactures = nbFactures;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
		
	
}
