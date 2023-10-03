package br.com.solides.blogapi.service;

import br.com.solides.blogapi.model.Photo;
import br.com.solides.blogapi.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public Photo addPhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public void deletePhoto(Long photoId) {
        photoRepository.deleteById(photoId);
    }
}