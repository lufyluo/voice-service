package com.voice.service.controller;

import com.voice.service.domain.dto.model.SoundDto;
import com.voice.service.domain.entity.Sound;
import com.voice.service.domain.service.sound.SoundService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lufy
 * @ClassName com.voice.service.controller.VoiceResourceController
 * @Description 音频资源模块-es
 */
@RestController
@RequestMapping("/sound")
public class SoundController {
    @Autowired
    private SoundService soundService;
    /**
     * 添加新资源
     *
     * @param soundDto
     * @return
     * @author
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ApiOperation(value = "添加资源", httpMethod = "POST", notes = "创建一条资源数据进es")
    public SoundDto post(@RequestBody SoundDto soundDto){
        return soundService.save(soundDto);
    }
    /**
     * 添加新资源
     *
     * @param title
     * @return
     * @author
     */
    @RequestMapping(value = "get", method = RequestMethod.GET)
    @ApiOperation(value = "查找资源", httpMethod = "GET", notes = "根据title获取资源")
    public List<SoundDto> get(@RequestParam String title){
        return soundService.findByTitle(title);
    }
}
