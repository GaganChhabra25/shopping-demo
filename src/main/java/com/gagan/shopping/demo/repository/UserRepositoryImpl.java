package com.gagan.shopping.demo.repository;

import com.gagan.shopping.demo.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.Transaction;

@Repository
public class UserRepositoryImpl implements UserRepository {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.openSession();
        org.hibernate.Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
    }
}
