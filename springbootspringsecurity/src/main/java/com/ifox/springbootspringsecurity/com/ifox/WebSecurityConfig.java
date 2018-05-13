package com.ifox.springbootspringsecurity.com.ifox;

import com.ifox.springbootspringsecurity.com.ifox.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:38 2018/5/10
 * @Modified By:
 */
@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {

    //完成自定义认证实体注入
    @Bean
    UserDetailsService userService()
    {
        return new UserService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()//所有请求必须登陆后访问
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .permitAll()//登录界面，错误界面可以直接访问
                .and()
                .logout()
                .permitAll();//注销请求可直接访问
    }

}
