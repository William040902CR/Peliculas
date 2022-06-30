/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Artistas;
import Entity.Conciertos;
import Repository.Artistas_Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class ArtistasService implements IArtistasService {

    @Autowired
    private Artistas_Repository Artistas_Repository;
    
    @Override
    public List<Artistas> getAllArtistas() {
    return (List<Artistas>)Artistas_Repository.findAll();
    }

    @Override
    public Artistas getArtistasbyIdArtistas(long idArtistas) {
     return Artistas_Repository.findById(idArtistas).orElse(null);  
    }

    @Override
    public void saveArtistas(Artistas Artistas) {
     Artistas_Repository.save(Artistas);  
    }

    @Override
    public void delete(long idArtistas) {
   Artistas_Repository.deleteById(idArtistas);
    }

 


 

   
    
}

