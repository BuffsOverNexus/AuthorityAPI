package com.buffsovernexus.AuthorityAPI.service;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AuthorityPlayerServiceTest {

    @Mock
    private AuthorityPlayerService authorityPlayerService;

    private String uuid;

    @BeforeEach
    public void onEachTest() {
        uuid = "12259f8b-cca4-4b28-acb2-082bfaf2a2e6";
    }


}
