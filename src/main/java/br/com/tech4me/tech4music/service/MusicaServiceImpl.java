package br.com.tech4me.tech4music.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.tech4me.tech4music.model.Musica;
import br.com.tech4me.tech4music.repository.MusicaRepository;
import br.com.tech4me.tech4music.shared.MusicaDto;

@Service
public class MusicaServiceImpl implements MusicaService {


@Autowired
private MusicaRepository repository;

private ModelMapper mapper = new ModelMapper();

@Override
public List<MusicaDto> obterTodasAsMusicas() {
    List<Musica> musicas = repository.findAll();
    return musicas.stream()
    .map(m -> new ModelMapper().map(m, MusicaDto.class))
    .collect(Collectors.toList()); 
}

@Override
public  MusicaDto obterMusicaPorId(String id) {
    Optional<Musica> musicas = repository.findById(id);
    
    if (musicas.isPresent()){
        return mapper.map(musicas.get(), MusicaDto.class);
    }
   
    return null;
}

@Override
public MusicaDto cadastrarMusica(MusicaDto musica) {
    Musica musicaSalvar = mapper.map(musica, Musica.class);
    repository.save(musicaSalvar);
    return mapper.map(musica, MusicaDto.class);
}


@Override
public void deletarMusica(String id) {
    repository.deleteById(id);
    
}

@Override
public MusicaDto alterarMusica(String id, MusicaDto musica) {
    Optional<Musica> musicaBusca = repository.findById(id);

    if (musicaBusca.isPresent()){
        Musica musicaAlterar =  mapper.map(musica, Musica.class);
        musicaAlterar.setId(id);
        musicaAlterar = repository.save(musicaAlterar);
        return mapper.map(musicaAlterar, MusicaDto.class);

    }
    return null;
}

@Override
public MusicaDto obterPorNome(String nome) {
    Musica musica = repository.findByTitulo(nome);

    return mapper.map(musica, MusicaDto.class);
}




    

    
}
