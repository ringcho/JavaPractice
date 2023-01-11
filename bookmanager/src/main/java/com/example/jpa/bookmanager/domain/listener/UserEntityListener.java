package com.example.jpa.bookmanager.domain.listener;

import com.example.jpa.bookmanager.domain.Person;
import com.example.jpa.bookmanager.domain.UserHistory;
import com.example.jpa.bookmanager.repository.UserHistoryRepository;
import com.example.jpa.bookmanager.support.BeanUtils;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class UserEntityListener {
    @PrePersist
    @PreUpdate
    public void perPersistAndPreUpdate(Object obj){
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);
        Person person = (Person) obj;
        UserHistory userHistory = new UserHistory();
        userHistory.setPersonId(person.getId());
        userHistory.setName(person.getName());
        userHistory.setEmail(person.getEmail());

        userHistoryRepository.save(userHistory);
    }
}
