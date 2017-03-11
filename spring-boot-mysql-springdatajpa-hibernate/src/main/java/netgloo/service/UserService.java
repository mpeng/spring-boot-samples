package netgloo.service;

import netgloo.models.User;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.HashSet;

@Service
public class UserService {
    private Map<String,User> users;
    private List<User> userList;

    @PostConstruct
    private void loadUser() {
        users = new HashMap<>();
        userList = new ArrayList<>();
        users.put("1",new User("tom@yahoo.com", "Tom"));
        users.put("2",new User("jerry@gmail.com", "Jerry"));
        userList.add( users.get("1"));
        userList.add( users.get("2"));
    }

    public User findById(String id) {
        return users.get(id);
    }

    public List<User> findAllUsers() {
        return userList;
    }
}