package com.example.cachuelosfrontend.model;
// Generated 05-oct-2014 14:18:06 by Hibernate Tools 3.4.0.CR1


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Commentratingtype generated by hbm2java
 */
@Entity
@Table(name="commentratingtype"
    ,catalog="cachuelos"
)
public class Commentratingtype  implements java.io.Serializable {


     private Integer idCommentType;
     private String name;
     private String description;
     private Set<Commentrating> commentratings = new HashSet<Commentrating>(0);

    public Commentratingtype() {
    }

    public Commentratingtype(String name, String description, Set<Commentrating> commentratings) {
       this.name = name;
       this.description = description;
       this.commentratings = commentratings;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idCommentType", unique=true, nullable=false)
    public Integer getIdCommentType() {
        return this.idCommentType;
    }
    
    public void setIdCommentType(Integer idCommentType) {
        this.idCommentType = idCommentType;
    }

    
    @Column(name="name", length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description", length=250)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    @JsonIgnore
    @OneToMany(fetch=FetchType.LAZY, mappedBy="commentratingtype")
    public Set<Commentrating> getCommentratings() {
        return this.commentratings;
    }
    
    public void setCommentratings(Set<Commentrating> commentratings) {
        this.commentratings = commentratings;
    }

    
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(name);
		return buffer.toString();
	}



}


