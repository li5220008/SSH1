package cn.itcast.service;

import java.util.List;

import cn.itcast.bean.Person;

public interface PersonService {

	public void save(Person person);

	public void update(Person person);

	public Person getPerson(Integer personid);

	public void delete(Integer personid);

	public List<Person> getPersons();

}