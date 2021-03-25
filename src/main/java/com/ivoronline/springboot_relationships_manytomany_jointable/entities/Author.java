package com.ivoronline.springboot_relationships_manytoone_jointable.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import java.util.Set;

@Entity
public class Author {

  //PRIMARY KEY
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  //RELATIONSHIP
  @ManyToMany(cascade = CascadeType.ALL)
  public Set<Book> books;

  //DATA
  public String  name;
  public Integer age;

}





