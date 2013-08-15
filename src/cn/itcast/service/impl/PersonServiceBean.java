package cn.itcast.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bean.Person;
import cn.itcast.service.PersonService;

@Transactional
public class PersonServiceBean implements PersonService {
	@Resource private SessionFactory sessionFactory;

	public void save(Person person){
		sessionFactory.getCurrentSession().persist(person);
	}
	
	public void update(Person person){
		sessionFactory.getCurrentSession().merge(person);
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Person getPerson(Integer personid){
		return (Person)sessionFactory.getCurrentSession().get(Person.class, personid);
	}

	public void delete(Integer personid){
		sessionFactory.getCurrentSession().delete(
				sessionFactory.getCurrentSession().load(Person.class, personid));
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Person> getPersons(){		
		return sessionFactory.getCurrentSession().createQuery("from Person").list();
	}
	
}
