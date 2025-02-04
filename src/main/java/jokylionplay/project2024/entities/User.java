package jokylionplay.project2024.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "users")
    private Set<Internship> internships = new HashSet<>();

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private Set<UserProgress> usersTasks = new HashSet<>();

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "e_mail")
    private String mail;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "telegram_id")
    private String telegramId;

    @Column(name = "info")
    private String info;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "city")
    private String city;

    @Column(name = "study_status")
    private String studyStatus;

    @Column(name = "place_of_study")
    private String placeOfStudy;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "course")
    private String course;
}
