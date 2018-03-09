package com.tangqiang.springboot.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO
 *
 * @author Tom
 * @version 1.0 2017-11-06 0006 Tom create
 * @date 2017-11-06 0006
 * @copyright Copyright © 2017 Grgbanking All rights reserved.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    private String id;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
