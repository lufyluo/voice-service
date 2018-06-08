package com.voice.service.instructure.Entity;

import org.springframework.data.annotation.CreatedDate;

public class RecordCreateEntity extends BaseEntity {
    @CreatedDate
    private Long createTime;
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
