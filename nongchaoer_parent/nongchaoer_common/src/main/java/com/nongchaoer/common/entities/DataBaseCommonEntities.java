package com.nongchaoer.common.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author : [xvChuShun]
 * @version : [v1.0]
 * @description : [通用数据库实体类]
 * @createTime : [2023/6/27 12:12]
 * @updateUser : [xvChuShun]
 * @updateTime : [2023/6/27 12:12]
 * @updateRemark : [创建通用数据库实体类]
 */
@Data
@NoArgsConstructor
public class DataBaseCommonEntities implements Serializable {
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    private String createBy;
    private String updateBy;

    private Integer deleteFlag;
}
