# SpringBoot-webapp-JPA-H2
SpringBoot webapp using JPA with H2


What is it?
-----------
Used Spring JPA with H2(In memeory database)

Created a repo Interface by extending CrudRepository - Doing this will give you access to all basic CRUD operations
public interface PersonRepo extends CrudRepository<Person, Integer>

Declare POJO with annotations with @Entity and @Id

to add a person you can call repo.save() --this is possible by extending CrudRepository

ModelAndView is used because of both data(setting the data to object) and view(Redirection page).

findBy___() methods can be declared with the column names to identify the data like where condition.
JPA will help map/associate with the table columns.

Annotations used:
-----------------
@Controller
@RequestMapping
@AutoWired --For the repo interface inside controller
@Query--For writing the custom query inside repo.
	@Query("from Person where paddress=?1 order by pname")
	List<Person> findByPaddressSorted(String paddress);



Project Structure:
------------------
model: POJOs
controller:controller class
DAO:Repository Interface by extending CrudRepository
