/***
 * @author Jeet Khatri
 */

package com.springboot.Topic;

import org.springframework.data.repository.CrudRepository;

/*
 * JPA - Java Persistence API
 * Here Integer is type of primary key
 * Here TopicClass is class name
 * */
public interface TopicRepository extends CrudRepository<TopicClass, Integer>{

	public TopicClass findBytopicId(int id);
}
