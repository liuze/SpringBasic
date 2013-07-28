/**
 * Copyright_2006, Liao Xuefeng
 * Created on 2006-3-9
 * 
 * For more information, please visit: http://www.crackj2ee.com
 */
package com.javaeedev.example.spring;

import java.util.*;

public class MyServiceBean implements ServiceBean {

    private String dir;
    private Map map = new HashMap();

    public void setUserDir(String dir) {
        this.dir = dir;
        System.out.println("Set user dir to: " + dir);
    }

    public void addUser(String username, String password) {
        if(!map.containsKey(username))
            map.put(username, password);
        else
            throw new RuntimeException("User already exist.");
    }

    public void deleteUser(String username) {
        if(map.remove(username)==null)
            throw new RuntimeException("User not exist.");
    }

    public boolean findUser(String username) {
        return map.containsKey(username);
    }

    public String getPassword(String username) {
        return (String)map.get(username);
    }
}
