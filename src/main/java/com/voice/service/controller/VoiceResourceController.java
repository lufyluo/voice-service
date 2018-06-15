package com.voice.service.controller;

import com.voice.service.domain.dto.VoiceDto;
import com.voice.service.domain.service.voice.IVoiceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lufy
 * @ClassName com.voice.service.controller.VoiceResourceController
 * @Description 音频资源模块
 */
@RestController
@RequestMapping("/voice")
public class VoiceResourceController {
    @Autowired
    private IVoiceService voiceService;

    /**
     * 添加新资源
     * @author
     * @param voiceDto
     * @return
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ApiOperation(value="获取用户详细信息",  httpMethod = "POST",notes="根据url的id来获取用户详细信息")
    //@ApiImplicitParam(name = "VoiceDto", value = "资源", required = true, dataType = "VoiceDto", paramType ="VoiceDto")
    public boolean post(@RequestBody VoiceDto voiceDto){
        return voiceService.Add(voiceDto);
    }
}
