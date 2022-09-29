package com.buffsovernexus.AuthorityAPI.entity;

import lombok.Data;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "authority_home")
@Data
public class AuthorityHome {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Integer id;

    private String name;
    private Date createdOn = new Date();
    private String world;
    private Double x, y, z;
    private Float yaw, pitch;

}
