package com.letscodes.courseapi.topic;

import org.springframework.data.repository.CrudRepository;

//import com.letscodes.mysql.User;
//
//public class TopicRepository {
//	//getAllTopics
//	//getTopic(String id)
//	//addTopic(Topic t)
//	//updateTopic(Topic t)
//	//deleteTopic(String id)
//
//}


public interface TopicRepository extends CrudRepository<Topic, String> {
	

}