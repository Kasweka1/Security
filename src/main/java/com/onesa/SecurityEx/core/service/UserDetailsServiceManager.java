package com.onesa.SecurityEx.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.onesa.SecurityEx.core.model.User;
import com.onesa.SecurityEx.core.model.UserPrinciple;
import com.onesa.SecurityEx.core.repository.UserRepository;


@Service
public class UserDetailsServiceManager implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if(user == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }
       return new UserPrinciple(user);
    }
    
}
