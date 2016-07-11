package com.iic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 7/6/2016.
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Long>{
}
