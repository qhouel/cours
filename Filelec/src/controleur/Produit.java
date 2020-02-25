package controleur;

public class Produit {
	private String ref, des;
	private float prix;
	private int qte;
	public Produit(String ref, String des, float prix, int qte) {
		super();
		this.ref = ref;
		this.des = des;
		this.prix = prix;
		this.qte = qte;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	
}
