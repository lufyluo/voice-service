package com.voice.service.instructure.Entity;

import org.springframework.data.annotation.LastModifiedDate;

public class RecordModifyEntity extends RecordCreateEntity{
    @LastModifiedDate
    private Long updateTime;
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
