package net.dao;

import net.model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("from User ", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }


    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }


    @Override
    public User getById(int id) {
        return entityManager.getReference(User.class, id);

    }


}
