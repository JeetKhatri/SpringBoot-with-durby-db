/***
 * @author Jeet Khatri
 */

package com.springboot.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicClass {
	
	@Id
	int topicId;
	String topicName;
	String topicDesc;

	public TopicClass() {
	}
	
	public TopicClass(int topicId, String topicName, String topicDesc) {
		super();
		this.topicId=topicId;
		this.topicName=topicName;
		this.topicDesc=topicDesc;
	}
	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

}
