package com.au.example.vaadintemplate.data;

import com.au.example.vaadintemplate.domain.DashboardNotification;
import com.au.example.vaadintemplate.domain.Movie;
import com.au.example.vaadintemplate.domain.Transaction;
import com.au.example.vaadintemplate.domain.User;

import java.util.Collection;
import java.util.Date;

/**
 * Created by ayhanugurlu on 1/25/19.
 */
public class DummyProvider implements DataProvider {

    @Override
    public Collection<Transaction> getRecentTransactions(int count) {
        return null;
    }

    @Override
    public User authenticate(String userName, String password) {
        return null;
    }

    @Override
    public int getUnreadNotificationsCount() {
        return 0;
    }

    @Override
    public Collection<DashboardNotification> getNotifications() {
        return null;
    }

    @Override
    public double getTotalSum() {
        return 0;
    }

    @Override
    public Collection<Movie> getMovies() {
        return null;
    }

    @Override
    public Movie getMovie(long movieId) {
        return null;
    }

    @Override
    public Collection<Transaction> getTransactionsBetween(Date startDate, Date endDate) {
        return null;
    }
}
