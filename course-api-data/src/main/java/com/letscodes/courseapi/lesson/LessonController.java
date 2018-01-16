package com.letscodes.courseapi.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {

	@Autowired 
	private LessonService lessonService;
}
