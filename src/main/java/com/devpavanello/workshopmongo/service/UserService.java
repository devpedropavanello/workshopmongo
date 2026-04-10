package com.devpavanello.workshopmongo.service;

import com.devpavanello.workshopmongo.entities.User;
import com.devpavanello.workshopmongo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
