/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.thiagorodrigues.crud.controller;


import br.thiagorodrigues.crud.model.PostTreino;
import br.thiagorodrigues.crud.repository.PostTreinoRepository;

import java.awt.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostTreinoController {

    @Autowired
    private PostTreinoRepository postTreinoRepository;

    @GetMapping(path = "/post/treino/{id}")
    public Optional<PostTreino> buscarPostID(@PathVariable(name = "id", required = true) long id) {
        return postTreinoRepository.findById(id);
    }

    @PostMapping(path = "/post/treino/create")
    public void criarPost(@RequestBody PostTreino post) {
        postTreinoRepository.save(post);
    }



}
