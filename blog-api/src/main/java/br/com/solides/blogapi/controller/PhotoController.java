package br.com.solides.blogapi.controller;

import br.com.solides.blogapi.model.Photo;
import br.com.solides.blogapi.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @PostMapping
    public ResponseEntity<Photo> addPhoto(@RequestBody Photo photo) {
        Photo addedPhoto = photoService.addPhoto(photo);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedPhoto);
    }

    @DeleteMapping("/{photoId}")
    public ResponseEntity<Void> deletePhoto(@PathVariable Long photoId) {
        photoService.deletePhoto(photoId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
