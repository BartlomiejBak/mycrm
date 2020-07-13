package com.mycrm.crm.dao;

import com.mycrm.crm.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("FROM Customer order by lastName asc , firstName asc , email asc", Customer.class);
        return query.getResultList();
    }

    @Override
    public void saveCustomer(Customer customer) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, theId);
        return customer;
    }
}
