package com.voice.service.domain.mapper;

import com.voice.service.domain.dto.model.SoundDto;
import com.voice.service.domain.entity.Sound;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper
public interface SoundMapper {
    SoundMapper INSTANCE = Mappers.getMapper( SoundMapper.class );
    @Mapping( source="ownerName",target="ownerUserName")
    SoundDto soundToSoundDto(Sound sound);

    Iterable<SoundDto> soundsToSoundDtos(Iterable<Sound> sounds);

    /* Page<SoundDto> pageSoundsToPageSoundDtos(Page<Sound> pageSounds); */
    default Page<SoundDto> pageSoundsToPageSoundDtos(Page<Sound> page) {
        return page.map(this::soundToSoundDto);
    }
    List<SoundDto> soundsToSoundDtos(List<Sound> sounds);
    @Mappings({
            @Mapping( source="ownerUserName",target="ownerName"),
            @Mapping(target = "id",ignore = true)
    })
    Sound soundDtoToSound(SoundDto soundDto);


}
