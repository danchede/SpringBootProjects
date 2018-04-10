package com.ifox.springbootjwtdemo.web.controller;

import com.ifox.springbootjwtdemo.entity.User;
import com.ifox.springbootjwtdemo.exception.UsernameIsExitedException;
import com.ifox.springbootjwtdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:17 2018/4/10
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/users")

public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * 获取用户列表
     * @return
     */

    @GetMapping(value = "/userList")
    public Map<String, Object> userList(){
        List<User> users = userRepository.findAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("users",users);
        return map;
    }

    /**
     * 注册用户 默认开启白名单
     * @param user
     */
    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        User bizUser = userRepository.findByUsername(user.getUsername());
        if(null != bizUser){
            throw new UsernameIsExitedException("用户已经存在");
        }
        user.setPassword(DigestUtils.md5DigestAsHex((user.getPassword()).getBytes()));
        return userRepository.save(user);
    }

}
