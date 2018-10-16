/***
 * @author Jeet Khatri
 */

package com.springboot.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<TopicClass> listOfTopics(){
		ArrayList<TopicClass> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public TopicClass topicDetails(int id){
		return topicRepository.findBytopicId(id);
	}
	
	public void addTopics(TopicClass topic){
		 topicRepository.save(topic);
	}

	public void updateTopics(TopicClass topic, int id) {
		topicRepository.save(topic);
	}

	public void deleteTopics(int id) {
		topicRepository.deleteById(id);
	}
}
