package com.voice.service.domain.repository.resource;

import com.voice.service.domain.entity.VoiceResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IResourceRepo extends JpaRepository<VoiceResource, Long> {
    @Query("select vr from  VoiceResource vr where vr.id=:id")
    VoiceResource findAllByKey(int id);
}
