package dev.malb.cardatabase.service;


import dev.malb.cardatabase.domain.User;
import dev.malb.cardatabase.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User currentUser = repository.findByUsername(username);
        UserDetails user = new org.springframework.security.core.userdetails.User(username,
                currentUser.getUsername(), true, true, true, true,
                AuthorityUtils.createAuthorityList(currentUser.getRole()));
        return user;


    }
}
