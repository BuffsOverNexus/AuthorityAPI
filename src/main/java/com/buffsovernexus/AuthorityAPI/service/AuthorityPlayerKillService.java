package com.buffsovernexus.AuthorityAPI.service;

import com.buffsovernexus.AuthorityAPI.repository.AuthorityPlayerKillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityPlayerKillService {

    @Autowired
    public AuthorityPlayerKillRepository authorityPlayerKillRepository;

}
