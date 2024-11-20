package com.thanneeruClasses.DMS.repository;
/*
 * @author Akash Thanneeru - S569652
 * 
 */
import org.springframework.data.repository.CrudRepository;

import com.thanneeruClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository <Dog, Integer>{

}
