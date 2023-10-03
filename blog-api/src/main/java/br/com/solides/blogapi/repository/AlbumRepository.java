package br.com.solides.blogapi.repository;

import br.com.solides.blogapi.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
