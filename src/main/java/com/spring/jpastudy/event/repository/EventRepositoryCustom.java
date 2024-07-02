package com.spring.jpastudy.event.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.jpastudy.event.entity.Event;

import java.util.List;

public interface EventRepositoryCustom {

    List<Event> findEvents(String sort);

}
