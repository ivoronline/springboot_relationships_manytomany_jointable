package com.ivoronline.springboot_relationships_manytomany_jointable.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Book {

  //PRIMARY KEY
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  //RELATIONSHIP
  @ManyToMany(mappedBy="books")
  public Set<Author> authors;

  //DATA
  public String  title;

}
