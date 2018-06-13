package com.voice.service.domain.entity;

import com.voice.service.instructure.Entity.RecordModifyEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "voiceResource")
public class VoiceResource extends RecordModifyEntity {
    private String title;
    private int createUserId;
    private int ownerUserId;
    private int seriesId;
    private long length;
    private long size;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public int getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(int ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public VoiceResource(){}

    public VoiceResource(String title,int createUserId,int ownerUserId,int seriesId,long length,long size){
        this.title = title;
        this.createUserId = createUserId;
        this.ownerUserId = ownerUserId;
        this.seriesId = seriesId;
        this.length = length;
        this.size = size;
    }
}
