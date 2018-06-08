package com.voice.service.controller;

import com.voice.service.domain.entity.VoiceResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    public List<VoiceResource> index(){
        List<VoiceResource> result = new ArrayList<VoiceResource>();
        result.add(new VoiceResource());
        return new ArrayList<VoiceResource>();

        }

}
