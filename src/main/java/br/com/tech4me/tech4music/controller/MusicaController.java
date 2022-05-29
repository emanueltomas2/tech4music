package br.com.tech4me.tech4music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4music.service.MusicaService;
import br.com.tech4me.tech4music.shared.MusicaDto;

@RestController
@RequestMapping("/musicas")

public class MusicaController {
    
    @Autowired
    private MusicaService service;

    @GetMapping
    public List<MusicaDto> obterTodasAsMusicas(){
        return service.obterTodasAsMusicas();
    }

    @GetMapping("/{id}")
    public MusicaDto obterMusiscaPorId(@PathVariable String id){
        return service.obterMusicaPorId(id);
    }
   
    @GetMapping("/nome/{nome}")
    public MusicaDto obterPorNome(@PathVariable String nome){
        return service.obterPorNome(nome);
    }

    @PostMapping
    public MusicaDto cadastrarMusica(@RequestBody MusicaDto musica){
        return service.cadastrarMusica(musica);
    }

    @PutMapping("/{id}")
    public MusicaDto alterarMusica(@PathVariable String id, @RequestBody MusicaDto musicaAlterar){
        return service.alterarMusica(id, musicaAlterar);
    }

    @DeleteMapping("/{id}")
    public void deletarMusica(@PathVariable String id){
         service.deletarMusica(id);
    }


}
