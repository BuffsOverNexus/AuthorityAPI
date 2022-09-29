package com.buffsovernexus.AuthorityAPI.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="authority_player")
@Data
public class AuthorityPlayer {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Integer id;

    private String uuid;

    private String name;

    private Date joined = new Date();

    private Date lastSeen = new Date();

    @OneToMany
    @JoinColumn(name = "player_id")
    private List<AuthorityHome> homes;

}
