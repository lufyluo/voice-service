package com.voice.service.domain.service.sound;

import com.voice.service.domain.dto.model.SoundDto;
import com.voice.service.domain.entity.Sound;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface SoundService {
    SoundDto save(SoundDto soundDto);

    void delete(SoundDto soundDto);

    SoundDto findOne(String id);

    Iterable<SoundDto> findAll();

    Page<SoundDto> findByAuthor(String author, PageRequest pageRequest);

    List<SoundDto> findByTitle(String title);
}
