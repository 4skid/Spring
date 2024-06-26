package ru.tukmakov.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tukmakov.springcourse.models.Person;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByFullName(String fullName);
}
