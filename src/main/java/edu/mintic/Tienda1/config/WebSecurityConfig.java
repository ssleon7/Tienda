/*package edu.mintic.Tienda1.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Autowired
    private DataSource dataSource;

    @Autowired
    private BCryptPasswordEncoder passEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/login", "/", "/css/**","/img/**", "/js/**").permitAll()
        .antMatchers("/menu").hasAnyRole("USER") 
        .antMatchers("/user").hasAnyRole("USER")
        .antMatchers("/menu").hasAnyRole("ADMIN") 
        .antMatchers("/user").hasAnyRole("ADMIN")
        .anyRequest().authenticated()
        .and()
        .formLogin().loginPage("/login")
        .permitAll()
        .and()
        .logout().permitAll();
    }

    @Autowired
    public void configurerSecurityGlobal (AuthenticationManagerBuilder buider) throws Exception{
        buider.jdbcAuthentication()
        .dataSource(dataSource)
        .passwordEncoder(passEncoder)
        .usersByUsernameQuery("select  username,  password, enabled from users where username=?")
        .authoritiesByUsernameQuery("select  u.username, r.rol from roles r inner join users u on r.user_id = u.id_user where  u.username = ?");
    }
}*/