package pet.pechenka.dao;

import pet.pechenka.entity.Driver;
import pet.pechenka.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class DriverRepositoryImpl implements DriverRepository{

    @Override
    public Driver findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Driver.class, id);
    }

    @Override
    public void save(Driver driver) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(driver);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Driver driver) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(driver);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Driver driver) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(driver);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Driver> findAllDrivers() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Query<Driver> query = session.createQuery("from Driver", Driver.class);
            return query.list();
        }
    }
}
