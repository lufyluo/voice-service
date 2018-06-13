package com.voice.service.controller;

import com.voice.service.domain.dto.VoiceDto;
import com.voice.service.domain.entity.VoiceResource;
import com.voice.service.domain.service.voice.IVoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voice")
public class VoiceResourceController {
    @Autowired
    private IVoiceService voiceService;
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public boolean post(@ModelAttribute VoiceDto voiceDto){
        return voiceService.add(voiceDto);
    }
}
