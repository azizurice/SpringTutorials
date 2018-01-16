package com.letscodes.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =new ArrayList<>(Arrays.asList(
			new Topic("1","Spring Framework","Spring Framework description"),
			new Topic("2","Core Java","Core Java Description"),
			new Topic("3", "Java Script","JavaScript Description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size(); i++){
			Topic t=topics.get(i);
			if (t.getId().equals(topic.getId())){
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
//		for(int i=0; i<topics.size(); i++){
//			Topic t=topics.get(i);
//			if (t.getId().equals(id)){
//				topics.remove(i);
//				return;
//			}
//		}
		// Using lamda
	topics.removeIf(t->t.getId().equals(id));	
		
	}
}
