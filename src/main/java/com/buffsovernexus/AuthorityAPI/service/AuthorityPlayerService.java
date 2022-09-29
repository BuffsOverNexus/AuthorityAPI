package com.buffsovernexus.AuthorityAPI.service;

import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayer;
import com.buffsovernexus.AuthorityAPI.repository.AuthorityPlayerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorityPlayerService {


    @Autowired
    AuthorityPlayerRepository authorityPlayerRepository;

    public ResponseEntity<AuthorityPlayer> getPlayerByUuid(String uuid) {
        Optional<AuthorityPlayer> authorityPlayer = authorityPlayerRepository.findPlayerByUuid(uuid);
        if (authorityPlayer.isEmpty())
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(authorityPlayer.get());
    }

    public ResponseEntity<AuthorityPlayer> getPlayerByName(String name) {
        Optional<AuthorityPlayer> authorityPlayer = authorityPlayerRepository.findPlayerByName(name);
        if (authorityPlayer.isEmpty())
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(authorityPlayer.get());
    }

    public ResponseEntity<AuthorityPlayer> getPlayerById(Integer id) {
        Optional<AuthorityPlayer> authorityPlayer = authorityPlayerRepository.findPlayerById(id);
        if (authorityPlayer.isEmpty())
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(authorityPlayer.get());
    }

}
