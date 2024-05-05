package org.example;

import org.example.model.Item;
import org.example.model.Person;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Person.class);

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Person person = session.get(Person.class, 1);
            System.out.println("Получли человека");

            session.getTransaction().commit();
            System.out.println("Сессия завершена(session.close)");

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            person = session.merge(person);
            Hibernate.initialize(person.getItems());

            session.getTransaction().commit();

            System.out.println("Вне второй сессии");
            System.out.println(person.getItems());
        }
    }
}
