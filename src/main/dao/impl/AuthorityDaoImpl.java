package main.dao.impl;

import main.dao.generic.AuthorityDao;
import main.entity.Authority;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public  class AuthorityDaoImpl extends GenericDaoImpl<Authority,String,String> implements AuthorityDao {
    public AuthorityDaoImpl() {
        super(Authority.class);
    }

}
