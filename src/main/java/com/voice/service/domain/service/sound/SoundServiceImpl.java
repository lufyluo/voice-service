package com.voice.service.domain.service.sound;

import com.voice.service.domain.dto.model.SoundDto;
import com.voice.service.domain.entity.Sound;
import com.voice.service.domain.mapper.SoundMapper;
import com.voice.service.domain.repository.sound.SoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoundServiceImpl implements SoundService {
    private SoundRepository soundRepository;
    private SoundMapper soundMapper = SoundMapper.INSTANCE;
    @Autowired
    public SoundServiceImpl(SoundRepository _soundRepository) {
        this.soundRepository = _soundRepository;
    }

    @Override
    public SoundDto save(SoundDto soundDto) {
        Sound sound = soundMapper.soundDtoToSound(soundDto);
        Sound newSound = soundRepository.save(sound);
        return  soundMapper.soundToSoundDto(newSound);
    }

    @Override
    public void delete(SoundDto soundDto) {
        soundRepository.delete(soundMapper.soundDtoToSound(soundDto));
    }

    @Override
    public SoundDto findOne(String id) {
        return soundMapper.soundToSoundDto(soundRepository.findById(id).get());
    }

    @Override
    public Iterable<SoundDto> findAll() {
        return soundMapper.soundsToSoundDtos(soundRepository.findAll());
    }

    @Override
    public Page<SoundDto> findByAuthor(String author, PageRequest pageRequest) {
        return soundMapper.pageSoundsToPageSoundDtos(soundRepository.findByOwnerName(author,pageRequest));
    }

    @Override
    public List<SoundDto> findByTitle(String title) {
        return soundMapper.soundsToSoundDtos(soundRepository.findByTitle(title));
    }
}
