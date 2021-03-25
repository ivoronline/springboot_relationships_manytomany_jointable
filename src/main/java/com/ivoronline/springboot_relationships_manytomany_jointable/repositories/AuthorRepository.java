package com.ivoronline.springboot_relationships_manytoone_jointable.repositories;

import com.ivoronline.springboot_relationships_manytoone_jointable.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> { }
