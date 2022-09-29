package com.buffsovernexus.AuthorityAPI.controller;

import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayer;
import com.buffsovernexus.AuthorityAPI.service.AuthorityPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthorityPlayerController {

    @Autowired
    private AuthorityPlayerService authorityPlayerService;

    @PostMapping("/player/uuid")
    public ResponseEntity<AuthorityPlayer> getPlayerByUUID(@Param("uuid") String uuid) {
        return authorityPlayerService.getPlayerByUuid(uuid);
    }

    @PostMapping("/player/name")
    public ResponseEntity<AuthorityPlayer> getPlayerByName(@Param("name") String name) {
        return authorityPlayerService.getPlayerByName(name);
    }

    @PostMapping("/player")
    public ResponseEntity<AuthorityPlayer> getPlayerById(@Param("id") Integer id) {
        return authorityPlayerService.getPlayerById(id);
    }
}
