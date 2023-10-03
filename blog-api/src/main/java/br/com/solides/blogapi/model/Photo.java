package br.com.solides.blogapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "photos")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
}
