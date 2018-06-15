package com.voice.service.domain.service.voice;

import com.voice.service.domain.dto.VoiceDto;
import com.voice.service.domain.entity.VoiceResource;
import com.voice.service.domain.repository.resource.IResourceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoiceService implements IVoiceService {
    @Autowired
    private IResourceRepo resourceRepo;
    @Override
    public List<VoiceResource> LoadByKey(String key) {
       return null;
    }

    @Override
    public boolean Add(VoiceDto voiceDto) {
        return resourceRepo.save(voiceDto.ToEntity())!=null;
    }
}
