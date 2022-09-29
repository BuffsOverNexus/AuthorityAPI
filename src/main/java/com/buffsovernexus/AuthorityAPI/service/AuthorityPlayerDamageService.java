package com.buffsovernexus.AuthorityAPI.service;

import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayer;
import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayerDamage;
import com.buffsovernexus.AuthorityAPI.repository.AuthorityPlayerDamageRepository;
import com.buffsovernexus.AuthorityAPI.repository.AuthorityPlayerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorityPlayerDamageService {

    @Autowired
    private AuthorityPlayerDamageRepository authorityPlayerDamageRepository;

    @Autowired
    private AuthorityPlayerRepository authorityPlayerRepository;

    public ResponseEntity<List<AuthorityPlayerDamage>> getDamageByAttackerAndDefender(Integer attackerId, Integer defenderId) {
        Optional<AuthorityPlayer> attacker = authorityPlayerRepository.findPlayerById(attackerId);
        Optional<AuthorityPlayer> defender = authorityPlayerRepository.findPlayerById(defenderId);
        if (attacker.isEmpty() || defender.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        List<AuthorityPlayerDamage> authorityPlayerDamages = authorityPlayerDamageRepository.findDamageByAttackerAndDefender(attacker.get(), defender.get());
        return ResponseEntity.ok(authorityPlayerDamages);
    }

    public ResponseEntity<List<AuthorityPlayerDamage>> getDamageByAttacker(Integer attackerId) {
        Optional<AuthorityPlayer> attacker = authorityPlayerRepository.findPlayerById(attackerId);
        if (attacker.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        List<AuthorityPlayerDamage> authorityPlayerDamages = authorityPlayerDamageRepository.findDamageByAttacker(attacker.get());
        return ResponseEntity.ok(authorityPlayerDamages);
    }

    public ResponseEntity<List<AuthorityPlayerDamage>> getDamageByDefender(Integer defenderId) {
        Optional<AuthorityPlayer> defender = authorityPlayerRepository.findPlayerById(defenderId);
        if (defender.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        List<AuthorityPlayerDamage> authorityPlayerDamages = authorityPlayerDamageRepository.findDamageByDefender(defender.get());
        return ResponseEntity.ok(authorityPlayerDamages);
    }

}
