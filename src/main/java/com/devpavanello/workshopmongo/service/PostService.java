package com.devpavanello.workshopmongo.service;

import com.devpavanello.workshopmongo.entity.Post;
import com.devpavanello.workshopmongo.entity.User;
import com.devpavanello.workshopmongo.repository.PostRepository;
import com.devpavanello.workshopmongo.service.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
