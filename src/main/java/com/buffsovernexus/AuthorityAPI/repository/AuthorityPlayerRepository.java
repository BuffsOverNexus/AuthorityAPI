package com.buffsovernexus.AuthorityAPI.repository;

import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthorityPlayerRepository extends JpaRepository<AuthorityPlayer, Integer> {

    Optional<AuthorityPlayer> findPlayerByUuid(String uuid);

    Optional<AuthorityPlayer> findPlayerByName(String name);

    Optional<AuthorityPlayer> findPlayerById(Integer id);
}
