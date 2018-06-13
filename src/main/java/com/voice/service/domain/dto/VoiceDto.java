package com.voice.service.domain.dto;

import com.voice.service.domain.entity.VoiceResource;

public class VoiceDto {
    private String title;
    private int createUserId;
    private int ownerUserId;
    private int seriesId;
    private long length;
    private long size;

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
    public VoiceResource ToEntity(){
        return new VoiceResource(this.title,this.createUserId,this.ownerUserId,this.seriesId,this.length,this.size);
    }
}
