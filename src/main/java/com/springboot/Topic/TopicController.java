/***
 * @author Jeet Khatri
 */

package com.springboot.Topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("topics")
	public List<TopicClass> listOfTopic() {
		return topicService.listOfTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public TopicClass topicDetails(@PathVariable int id) {
		return topicService.topicDetails(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody TopicClass topic) {
		 topicService.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody TopicClass topic, @PathVariable int id) {
		 topicService.updateTopics(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopc(@PathVariable int id) {
		 topicService.deleteTopics(id);
	}
}
