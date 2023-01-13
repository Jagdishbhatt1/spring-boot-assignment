package com.spring.boot.springbootassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class EmployeeRestController {

    @Autowired
    private TopicService topicService;
    @Autowired
    private TopicRepository topicRepository;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Optional<Topic> getResponseId(@PathVariable("id") int id){
        return topicRepository.findById(id);
    }
    //Post request
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //Put ??????????

    //Delete ????????

}
