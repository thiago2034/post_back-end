/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.thiagorodrigues.crud.controller;

import br.thiagorodrigues.crud.model.PostModel;
import br.thiagorodrigues.crud.repository.PostRepository;

import java.awt.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping(path = "/post")
    public List<PostModel> buscarPost() {
        return postRepository.findAll();
    }

    @GetMapping(path = "/post/{id}")
    public Optional<PostModel> buscarPostID(@PathVariable(name = "id", required = true) long id) {
        return postRepository.findById(id);
    }

    @PostMapping(path = "/post/create")
        public void criarPost(@RequestBody PostModel post) {
            postRepository.save(post);
    }

    @DeleteMapping(path = "post/delete/{id}")
    public void deletePost(
            @PathVariable(name = "id", required = true) long id
    ) {
        postRepository.deleteById(id);
    }


}
