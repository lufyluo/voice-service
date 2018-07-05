package com.voice.service.domain.repository.sound;

import com.voice.service.domain.entity.Sound;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface SoundRepository extends ElasticsearchRepository<Sound, String> {
    Page<Sound> findByOwnerName(String ownerName, Pageable pageable);

    List<Sound> findByTitle(String title);
}
