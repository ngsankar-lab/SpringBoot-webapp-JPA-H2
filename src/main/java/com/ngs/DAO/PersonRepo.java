package com.ngs.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ngs.model.Person;

public interface PersonRepo extends CrudRepository<Person, Integer>{

	List<Person> findByPaddress(String paddress);
	List<Person> findByPidGreaterThan(int pid);
	
	@Query("from Person where paddress=?1 order by pname")
	List<Person> findByPaddressSorted(String paddress);

	
	
}
