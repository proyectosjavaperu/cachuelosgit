package com.example.cachuelosfrontend.model;

// Generated 05-oct-2014 14:18:06 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "cachuelos")
@XmlRootElement
public class User implements java.io.Serializable {

	private Integer idUser;
	private Zone zone;
	private String name;
	private String lastName;
	private String email;
	private String updatedAt;
	private String pictureFull;
	private String pictureThumb;
	private int isworker;
	private boolean worker = false;
	private String gcmid;
	private int isActive;
	private boolean active;
	private String password;
	private Date createdAt;
	private String secretkey;
	private String dni;
	private String facebookid;
	private String facebooktoken;
	private Set<Cachuelo> cachuelos = new HashSet<Cachuelo>(0);
	private Set<Location> locations = new HashSet<Location>(0);
	private Set<Workerbytypecachuelo> workerbytypecachuelos = new HashSet<Workerbytypecachuelo>(
			0);
	private Set<Commentrating> commentratings = new HashSet<Commentrating>(0);
	private Set<Userlocationbytime> userlocationbytimes = new HashSet<Userlocationbytime>(
			0);
	private Set<Offer> offers = new HashSet<Offer>(0);
	private Set<Message> messagesForIdUserSender = new HashSet<Message>(0);
	private Set<Digitalizeddocument> digitalizeddocuments = new HashSet<Digitalizeddocument>(
			0);
	private Set<Message> messagesForIdReceiver = new HashSet<Message>(0);
	private Double avgStars = 0.0;

	public User() {
	}

	public User(String name, String lastName, String email, int isworker,
			int isActive, String password, Date createdAt) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.isworker = isworker;
		this.isActive = isActive;
		this.password = password;
		this.createdAt = createdAt;
	}

	public User(Zone zone, String name, String lastName, String email,
			String updatedAt, String pictureFull, String pictureThumb,
			int isworker, String gcmid, int isActive, String password,
			Date createdAt, String secretkey, String dni,
			Set<Cachuelo> cachuelos, Set<Location> locations,
			Set<Workerbytypecachuelo> workerbytypecachuelos,
			Set<Commentrating> commentratings,
			Set<Userlocationbytime> userlocationbytimes, Set<Offer> offers,
			Set<Message> messagesForIdUserSender,
			Set<Digitalizeddocument> digitalizeddocuments,
			Set<Message> messagesForIdReceiver) {
		this.zone = zone;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.updatedAt = updatedAt;
		this.pictureFull = pictureFull;
		this.pictureThumb = pictureThumb;
		this.isworker = isworker;
		this.gcmid = gcmid;
		this.isActive = isActive;
		this.password = password;
		this.createdAt = createdAt;
		this.secretkey = secretkey;
		this.dni = dni;
		this.cachuelos = cachuelos;
		this.locations = locations;
		this.workerbytypecachuelos = workerbytypecachuelos;
		this.commentratings = commentratings;
		this.userlocationbytimes = userlocationbytimes;
		this.offers = offers;
		this.messagesForIdUserSender = messagesForIdUserSender;
		this.digitalizeddocuments = digitalizeddocuments;
		this.messagesForIdReceiver = messagesForIdReceiver;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idUser", unique = true, nullable = false)
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	@Transient
	public Double getAvgStars() {
		return avgStars;
	}

	public void setAvgStars(Double avgStars) {
		this.avgStars = avgStars;
	}

	@XmlTransient
	@Transient
	public boolean getWorker() {
		return worker;
	}

	public void setWorker(boolean worker) {
		this.worker = worker;
	}

	@XmlTransient
	@Transient
	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@JsonIgnore
	@XmlTransient
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idHomeZone")
	public Zone getZone() {
		return this.zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "last_name", nullable = false, length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", nullable = false, length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlTransient
	@Column(name = "updated_at", length = 18)
	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@XmlTransient
	@Column(name = "picture_full", length = 20)
	public String getPictureFull() {
		return this.pictureFull;
	}

	public void setPictureFull(String pictureFull) {
		this.pictureFull = pictureFull;
	}

	@XmlTransient
	@Column(name = "picture_thumb", length = 20)
	public String getPictureThumb() {
		return this.pictureThumb;
	}

	public void setPictureThumb(String pictureThumb) {
		this.pictureThumb = pictureThumb;
	}

	@XmlTransient
	@Column(name = "isworker", nullable = false)
	public int getIsworker() {
		return this.isworker;
	}

	public void setIsworker(int isworker) {
		this.isworker = isworker;
	}

	@XmlTransient
	@Column(name = "gcmid", length = 260)
	public String getGcmid() {
		return this.gcmid;
	}

	public void setGcmid(String gcmid) {
		this.gcmid = gcmid;
	}

	@XmlTransient
	@Column(name = "isActive", nullable = false)
	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	@JsonIgnore
	@XmlTransient
	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlTransient
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@XmlTransient
	@Column(name = "secretkey", length = 256)
	public String getSecretkey() {
		return this.secretkey;
	}

	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}

	@XmlTransient
	@Column(name = "dni", length = 10)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@JsonIgnore
	@XmlTransient
	@Column(name = "facebookid", length = 255)
	public String getFacebookid() {
		return facebookid;
	}

	public void setFacebookid(String facebookid) {
		this.facebookid = facebookid;
	}

	@JsonIgnore
	@XmlTransient
	@Column(name = "facebooktoken", length = 300)
	public String getFacebooktoken() {
		return facebooktoken;
	}

	public void setFacebooktoken(String facebooktoken) {
		this.facebooktoken = facebooktoken;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	public Set<Cachuelo> getCachuelos() {
		return this.cachuelos;
	}

	public void setCachuelos(Set<Cachuelo> cachuelos) {
		this.cachuelos = cachuelos;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Location> getLocations() {
		return this.locations;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Workerbytypecachuelo> getWorkerbytypecachuelos() {
		return this.workerbytypecachuelos;
	}

	public void setWorkerbytypecachuelos(
			Set<Workerbytypecachuelo> workerbytypecachuelos) {
		this.workerbytypecachuelos = workerbytypecachuelos;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Commentrating> getCommentratings() {
		return this.commentratings;
	}

	public void setCommentratings(Set<Commentrating> commentratings) {
		this.commentratings = commentratings;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Userlocationbytime> getUserlocationbytimes() {
		return this.userlocationbytimes;
	}

	public void setUserlocationbytimes(
			Set<Userlocationbytime> userlocationbytimes) {
		this.userlocationbytimes = userlocationbytimes;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Offer> getOffers() {
		return this.offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByIdUserSender")
	public Set<Message> getMessagesForIdUserSender() {
		return this.messagesForIdUserSender;
	}

	public void setMessagesForIdUserSender(Set<Message> messagesForIdUserSender) {
		this.messagesForIdUserSender = messagesForIdUserSender;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Digitalizeddocument> getDigitalizeddocuments() {
		return this.digitalizeddocuments;
	}

	public void setDigitalizeddocuments(
			Set<Digitalizeddocument> digitalizeddocuments) {
		this.digitalizeddocuments = digitalizeddocuments;
	}

	@JsonIgnore
	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByIdReceiver")
	public Set<Message> getMessagesForIdReceiver() {
		return this.messagesForIdReceiver;
	}

	public void setMessagesForIdReceiver(Set<Message> messagesForIdReceiver) {
		this.messagesForIdReceiver = messagesForIdReceiver;
	}

	public String toString() {

		StringBuilder buffer = new StringBuilder();
		buffer.append(name);
		buffer.append(" ").append(lastName);
		return buffer.toString();
	}

}
