package com.buffsovernexus.AuthorityAPI.controller;

import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayerDamage;
import com.buffsovernexus.AuthorityAPI.service.AuthorityPlayerDamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorityPlayerDamageController {

    @Autowired
    private AuthorityPlayerDamageService authorityPlayerDamageService;

    @PostMapping("/history/damage")
    public ResponseEntity<List<AuthorityPlayerDamage>> getHistoryGivenAttackerAndDefender(@Param("attacker") @DefaultValue("0") Integer attacker,
                                                                                          @Param("defender") @DefaultValue("0") Integer defender) {
        return authorityPlayerDamageService.getDamageByAttackerAndDefender(attacker, defender);
    }

    @PostMapping("/history/damage/attacker")
    public ResponseEntity<List<AuthorityPlayerDamage>> getHistoryGivenAttacker(@Param("id") @DefaultValue("0") Integer id) {
        return authorityPlayerDamageService.getDamageByAttacker(id);
    }

    @PostMapping("/history/damage/defender")
    public ResponseEntity<List<AuthorityPlayerDamage>> getHistoryGivenDefender(@Param("id") @DefaultValue("0") Integer id) {
        return authorityPlayerDamageService.getDamageByDefender(id);
    }
}
