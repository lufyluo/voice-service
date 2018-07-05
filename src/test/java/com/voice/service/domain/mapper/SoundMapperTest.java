package com.voice.service.domain.mapper;

import com.voice.service.domain.dto.model.SoundDto;
import com.voice.service.domain.entity.Sound;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class SoundMapperTest {
    private SoundDto soundSource;
    public SoundMapperTest(){
        soundSource = new SoundDto();
        soundSource.setAlbumName("七里香");
        soundSource.setLength(1);
        soundSource.setOwnerUserName("Jay");
        soundSource.setOwnerUserId(1);
        soundSource.setSize(1);
        soundSource.setTitle("七里香");
        soundSource.setUploaderName("lufy");

    }
    @Test
    public void SoundMapperNomarlTest(){
        Sound target = SoundMapper.INSTANCE.soundDtoToSound(soundSource);
        Assert.assertEquals( target.getAlbumName(),soundSource.getAlbumName() );
        Assert.assertEquals( target.getSize(),soundSource.getSize() );
    }
    @Test
    public void listTest(){
        Sound target = SoundMapper.INSTANCE.soundDtoToSound(soundSource);
        List<Sound> list = new ArrayList<Sound>();
        list.add(target);
        List<SoundDto> dtos = SoundMapper.INSTANCE.soundsToSoundDtos(list);
        Assert.assertEquals( dtos.size(),1);
        Assert.assertEquals( dtos.get(0).getAlbumName(),soundSource.getAlbumName());

    }
}
