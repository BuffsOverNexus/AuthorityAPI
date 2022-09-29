package com.buffsovernexus.AuthorityAPI.repository;

import com.buffsovernexus.AuthorityAPI.entity.AuthorityPlayerKill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityPlayerKillRepository extends JpaRepository<AuthorityPlayerKill, Integer> {
}
