/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Entity.Artistas;
import Entity.Conciertos;
import java.util.List;

/**
 *
 * @author wjosu
 */
public interface IArtistasService {
   public List <Artistas> getAllArtistas();
   public Artistas getArtistasByIdArtistas (long idArtistas);
   public void saveArtistas(Artistas Artistas);
   public void delete (long idArtistas);

    public List<Conciertos> list();
}