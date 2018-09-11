package main.service.impl;

import main.dao.generic.AuthorityDao;
import main.entity.Authority;
import main.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityDao dao;

    @Override
    public void addAuthority(Authority authority) {
        dao.addElement(authority);
    }
}
