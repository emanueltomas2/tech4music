package br.com.tech4me.tech4music.service;

import java.util.List;
import br.com.tech4me.tech4music.shared.MusicaDto;

public interface MusicaService {

    List<MusicaDto> obterTodasAsMusicas();
    MusicaDto obterMusicaPorId(String id);
    MusicaDto obterPorNome (String nome);
    MusicaDto cadastrarMusica (MusicaDto musica);
    void deletarMusica(String id);
    MusicaDto alterarMusica (String id, MusicaDto musicaAlterar);
    

    
}
