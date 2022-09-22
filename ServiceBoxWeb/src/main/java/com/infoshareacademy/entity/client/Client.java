package com.infoshareacademy.entity.client;

import com.infoshareacademy.entity.user.User;
import com.infoshareacademy.entity.vehicle.Vehicle;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "nip", columnDefinition = "VARCHAR(10)", unique = true)
    private String nip;

    @Column(name = "phone", unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "notify")
    private boolean allowNotify = false;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private List<Vehicle> vehicles;
}