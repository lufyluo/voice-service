package com.voice.service.controller;

import com.voice.service.domain.dto.model.VoiceDto;
import com.voice.service.domain.entity.VoiceResource;
import com.voice.service.domain.service.voice.IVoiceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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
     *
     * @param voiceDto
     * @return
     * @author
     */
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ApiOperation(value = "添加资源", httpMethod = "POST", notes = "创建一条资源数据")
    //@ApiImplicitParam(name = "VoiceDto", value = "资源", required = true, dataType = "VoiceDto", paramType ="VoiceDto")
    public boolean post(@RequestBody VoiceDto voiceDto) {
        return voiceService.Add(voiceDto);
    }

    @RequestMapping(value = "/seek", method = RequestMethod.GET)
    public Page<VoiceResource> seek(@RequestParam String search, @PageableDefault(page=0,size=10,sort = { "id" }, direction = Sort.Direction.DESC)Pageable pageable) {
        return voiceService.LoadByKey(search,pageable);
    }
}
