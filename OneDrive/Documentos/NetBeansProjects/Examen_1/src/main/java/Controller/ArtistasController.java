/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Artistas;
import Entity.Conciertos;
import Service.IArtistasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArtistasController {
   @Autowired
    private IArtistasService ArtistasService;
 
  @Autowired
    private IArtistasService ConciertosService;
 
 @GetMapping("/Artista")
 public String index (Model model){
 List<Artistas> listaArtistas = ArtistasService.getAllArtistas();
 model.addAttribute("titulo", "Tabla Artistas");
  model.addAttribute("Artistas", listaArtistas);
     return "personas";
 }
 
  @GetMapping("/ArtistasN")
 public String crearArtistas (Model model){
 List<Conciertos> listaConciertos = ConciertosService.list();
 model.addAttribute("Artistas", new Artistas());
  model.addAttribute("Conciertos", listaConciertos);
     return "crear";
 }
 
 @GetMapping("/save")
 public String guardarArtistas (@ModelAttribute Artistas artistas){
 ArtistasService.saveArtistas(artistas);
     return "redirect:/Artistas";
 }
 
 @GetMapping("/editArtistaN")
 public String editarArtistas (@PathVariable("idArtistas") Long idArtistas,Model model){
 Artistas artistas = ArtistasService.getArtistasByIdArtistas(idArtistas);
     List<Conciertos> listaConciertos = ConciertosService.list();
 model.addAttribute("Artistas",  artistas);
  model.addAttribute("Conciertos", listaConciertos);
     return "crear";
}
 
}
