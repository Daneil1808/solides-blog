package br.com.solides.blogapi.service;

import br.com.solides.blogapi.model.Album;
import br.com.solides.blogapi.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

    public Optional<Album> getAlbum(Long albumId) {
        return albumRepository.findById(albumId);
    }

    public void deleteAlbum(Long albumId) {
        albumRepository.deleteById(albumId);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }
}
