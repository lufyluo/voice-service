package com.voice.service.domain.service.voice;

import com.voice.service.domain.dto.VoiceDto;
import com.voice.service.domain.entity.VoiceResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IVoiceService {

    boolean Add(VoiceDto voiceDto);

    Page<VoiceResource> LoadByKey(String search, Pageable pageable);
}
