package com.bth.sao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bth.sao.model.User;
import com.bth.sao.model.UserPrincipal;
import com.bth.sao.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        
        if (user == null) {
            System.out.print("User not found");
            throw new UsernameNotFoundException("User name not found");
        }
        
        return new UserPrincipal(user);
    }
}
