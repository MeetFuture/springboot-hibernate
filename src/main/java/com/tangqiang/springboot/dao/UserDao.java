package com.tangqiang.springboot.dao;

import com.tangqiang.springboot.pojo.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TODO
 *
 * @author Tom
 * @version 1.0 2017-11-06 0006 Tom create
 * @date 2017-11-06 0006
 * @copyright Copyright © 2017 Grgbanking All rights reserved.
 */
@Repository
public interface UserDao extends CrudRepository<User, String> {

    @Query
    public List<User> getUser();

}
