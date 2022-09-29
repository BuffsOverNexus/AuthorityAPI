package com.buffsovernexus.AuthorityAPI.repository;

import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayer;
import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayerDamage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorityPlayerDamageRepository extends JpaRepository<AuthorityPlayerDamage, Integer> {


    List<AuthorityPlayerDamage> findDamageByAttackerAndDefender(AuthorityPlayer attacker, AuthorityPlayer defender);

    List<AuthorityPlayerDamage> findDamageByAttacker(AuthorityPlayer attacker);

    List<AuthorityPlayerDamage> findDamageByDefender(AuthorityPlayer defender);
}
