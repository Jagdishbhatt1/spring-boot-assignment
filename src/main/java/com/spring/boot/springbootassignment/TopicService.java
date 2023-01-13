package com.spring.boot.springbootassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
        @Autowired
        private TopicRepository topicRepository;

       /* private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "jag","developer"),
                new Topic(2,"bhatt", "Programmer")));*/

        public List<Topic> getAllTopics(){
                List<Topic> topics = new ArrayList<>();
                topicRepository.findAll().forEach(topics::add);
                return topics;
        }

       /* public Topic getTopic(String name){
               return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
        }*/

        public void addTopic(Topic topic){
                topicRepository.save(topic);
        }


}
