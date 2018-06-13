package com.voice.service.instructure.Entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;

@EntityListeners(AuditingEntityListener.class)
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
