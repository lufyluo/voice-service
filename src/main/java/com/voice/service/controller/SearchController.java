package com.voice.service.controller;

import com.voice.service.domain.entity.VoiceResource;
import com.voice.service.domain.repository.resource.IResourceRepo;
import com.voice.service.domain.service.voice.IVoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private IVoiceService voiceService;
    @RequestMapping(value = "/seek", method = RequestMethod.GET)
    public List<VoiceResource> index() {
        List<VoiceResource> result = new ArrayList<VoiceResource>();
        VoiceResource vr = new VoiceResource();
        vr.setCreateUserId(1);
        vr.setOwnerUserId(111);
        result.add(vr);
        return result;

    }
}
