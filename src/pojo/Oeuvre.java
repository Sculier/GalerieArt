package pojo;

// Generated 13 avr. 2014 16:46:50 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Oeuvre generated by hbm2java
 */
@Entity
@Table(name = "oeuvre", catalog = "galerieart09")
public class Oeuvre implements java.io.Serializable {

	private Integer idOeuvre;
	private Categorie categorie;
	private Artiste artiste;
	private Courant courant;
	private Technique technique;
	private DetailFacture detailFacture;
	private String nomOeuvre;
	private String description;
	private int hauteur;
	private int largeur;
	private double prixPlancher;
	private double prixAffiche;
	private double prixNegocie;
	private float pourcentageComission=0.0f;
	private float tauxTva= 6.0f;
	private byte vendu;
	private Set<Situation> situations = new HashSet<Situation>(0);
	
	
	public Oeuvre() {
	}

	public Oeuvre(Categorie categorie, Artiste artiste,	Courant courant, Technique technique, 
			String nomOeuvre, String description, int hauteur, int largeur, double prixPlancher, 
			double prixAffiche,float tauxTva, double prixNegocie, byte vendu,float pourcentageComission) {
		this.categorie = categorie;
		this.artiste = artiste;
		this.courant = courant;
		this.technique = technique;
		this.nomOeuvre = nomOeuvre;
		this.description=description;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.prixPlancher = prixPlancher;
		this.prixAffiche = prixAffiche;
		this.tauxTva = tauxTva;
		this.prixNegocie = prixNegocie;
		this.vendu = vendu;
		this.pourcentageComission = pourcentageComission;
	}

	public Oeuvre(Categorie categorie, Artiste artiste,
			Courant courant, Technique technique, DetailFacture detailFacture,
			String nomOeuvre, String description, int hauteur, int largeur, double prixPlancher,
			double prixAffiche, float tauxTva, double prixNegocie, 
			byte vendu, Set<Situation> situations) {
		this.categorie = categorie;
		this.artiste = artiste;
		this.courant = courant;
		this.technique = technique;
		this.detailFacture = detailFacture;
		this.nomOeuvre = nomOeuvre;
		this.description=description;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.prixPlancher = prixPlancher;
		this.prixAffiche = prixAffiche;
		this.prixNegocie = prixNegocie;
		this.tauxTva = tauxTva;
		this.vendu = vendu;
		this.situations = situations;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idOeuvre", unique = true, nullable = false)
	public Integer getIdOeuvre() {
		return this.idOeuvre;
	}

	public void setIdOeuvre(Integer idOeuvre) {
		this.idOeuvre = idOeuvre;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCategorie", nullable = false)
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idArtiste", nullable = false)
	public Artiste getArtiste() {
		return this.artiste;
	}

	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCourant", nullable = false)
	public Courant getCourant() {
		return this.courant;
	}

	public void setCourant(Courant courant) {
		this.courant = courant;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTechnique", nullable = false)
	public Technique getTechnique() {
		return this.technique;
	}

	public void setTechnique(Technique technique) {
		this.technique = technique;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "oeuvre")
	public DetailFacture getdetailFacture() {
		return this.detailFacture;
	}

	public void setdetailFacture(DetailFacture detailFacture) {
		this.detailFacture = detailFacture;
	}

	@Column(name = "nomOeuvre", nullable = false, length = 100)
	public String getNomOeuvre() {
		return this.nomOeuvre;
	}

	public void setNomOeuvre(String nomOeuvre) {
		this.nomOeuvre = nomOeuvre;
	}

	@Column(name = "description", nullable = false, length = 65535)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "hauteur", nullable = false)
	public int getHauteur() {
		return this.hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	@Column(name = "largeur", nullable = false)
	public int getLargeur() {
		return this.largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Column(name = "prixPlancher", nullable = false, precision = 22, scale = 0)
	public double getPrixPlancher() {
		return this.prixPlancher;
	}

	public void setPrixPlancher(double prixPlancher) {
		this.prixPlancher = prixPlancher;
	}

	@Column(name = "prixAffiche", nullable = false, precision = 22, scale = 0)
	public double getPrixAffiche() {
		return this.prixAffiche;
	}

	public void setPrixAffiche(double prixAffiche) {
		this.prixAffiche = prixAffiche;
	}
	
	@Column(name = "prixNegocie", nullable = true, precision = 22, scale = 0)
	public double getPrixNegocie() {
		return prixNegocie;
	}

	public void setPrixNegocie(double prixNegocie) {
		this.prixNegocie = prixNegocie;
	}
	
	@Column(name = "pourcentageComission", nullable = false, precision = 12, scale = 0)
	public float getPourcentageComission() {
		return this.pourcentageComission;
	}

	public void setPourcentageComission(float pourcentageComission) {
		this.pourcentageComission = pourcentageComission;
	}

	@Column(name = "vendu", nullable = false)
	public byte getVendu() {
		return this.vendu;
	}

	public void setVendu(byte vendu) {
		this.vendu = vendu;
	}
	
	@Column(name = "tauxTva", nullable = false, precision = 12, scale = 0)
	public float getTauxTva() {
		return this.tauxTva;
	}

	public void setTauxTva(float tauxTva) {
		this.tauxTva = tauxTva;
	}
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "oeuvre")
	public Set<Situation> getSituations() {
		return situations;
	}

	public void setSituations(Set<Situation> situations) {
		this.situations = situations;
	}

	@Override
	public String toString() {
		return "Oeuvre [idOeuvre=" + idOeuvre + ", categorie=" + categorie
				+ ", artiste=" + artiste + ", courant=" + courant
				+ ", technique=" + technique + ", detailFacture="
				+ detailFacture + ", nomOeuvre=" + nomOeuvre + ", description="
				+ description + ", hauteur=" + hauteur + ", largeur=" + largeur
				+ ", prixPlancher=" + prixPlancher + ", prixAffiche="
				+ prixAffiche + ", prixNegocie=" + prixNegocie
				+ ", pourcentageComission=" + pourcentageComission
				+ ", tauxTva=" + tauxTva + ", vendu=" + vendu + "]";
	}


	
	

	
	


	
	
}
