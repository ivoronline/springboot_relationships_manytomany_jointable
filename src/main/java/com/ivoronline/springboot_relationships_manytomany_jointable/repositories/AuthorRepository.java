package com.ivoronline.springboot_relationships_manytomany_jointable.repositories;

import com.ivoronline.springboot_relationships_manytomany_jointable.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> { }
