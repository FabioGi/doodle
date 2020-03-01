//package fr.istic.sir.doodle.form;
//
//import java.io.Serializable;
//
//public class JwtRequest implements Serializable {
//
//	private static final long serialVersionUID = 5926468583005150707L;
//	
//	private String nom;
//	private String prenom;
//	private String password;
//	
//	//need default constructor for JSON Parsing
//	public JwtRequest()
//	{
//		
//	}
//
//	public JwtRequest(String prenom, String password) {
//		this.setUsername(prenom);
//		this.setPassword(password);
//	}
//
//	public String getUsername() {
//		return this.prenom;
//	}
//
//	public void setUsername(String prenom) {
//		this.prenom = prenom;
//	}
//
//	public String getPassword() {
//		return this.password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//}