package com.voice.service.domain.service.voice;

import com.voice.service.domain.dto.model.VoiceDto;
import com.voice.service.domain.entity.VoiceResource;
import com.voice.service.domain.repository.resource.IResourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VoiceService implements IVoiceService {
    @Autowired
    private IResourceRepo resourceRepo;


    @Override
    public boolean Add(VoiceDto voiceDto) {
        return resourceRepo.save(voiceDto.ToEntity())!=null;
    }

    @Override
    public Page<VoiceResource> LoadByKey(String search, Pageable pageable) {
        return resourceRepo.findAll(pageable);
    }
}
