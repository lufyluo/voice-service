package com.voice.service.domain.service.voice;

import com.voice.service.domain.dto.VoiceDto;
import com.voice.service.domain.entity.VoiceResource;

import java.util.List;

public interface IVoiceService {
    List<VoiceResource> LoadByKey(String key);
    boolean add(VoiceDto voiceDto);
}
