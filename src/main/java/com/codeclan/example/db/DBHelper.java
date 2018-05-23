package com.codeclan.example.db;

import models.Department;
import models.Manager;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.HashMap;
import java.util.List;

public class DBHelper {

    private static Transaction transaction;
    private static Session session;

    public static void save(Object object) {
        session = db.HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void deleteAll(Class classType) {
        session = db.HibernateUtil.getSessionFactory().openSession();

        try {
            String hql = "DELETE FROM " + classType.getName();
            transaction = session.beginTransaction();
            session.createQuery(hql).executeUpdate();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public static void delete(Object object) {
        session = db.HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static <T> List<T> getAll(Class classType) {
        session = db.HibernateUtil.getSessionFactory().openSession();
        List<T> results = null;
        try {
            Criteria cr = session.createCriteria(classType);
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

    public static <T> T find(int id, Class classType) {
        session = db.HibernateUtil.getSessionFactory().openSession();
        T result = null;

        try {
            Criteria cr = session.createCriteria(classType);
            cr.add(Restrictions.eq("id", id));
            result = (T)cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;

    }


}
