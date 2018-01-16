package com.letscodes.courseapi.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	@Autowired
	private LessonRepository lessonRepository;
	

}
