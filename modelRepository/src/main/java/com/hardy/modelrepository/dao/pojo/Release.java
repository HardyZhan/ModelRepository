package com.hardy.modelrepository.dao.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName release
 */
@Data
public class Release implements Serializable {
    /**
     * 
     */
    private Long releaseId;

    /**
     * 
     */
    private String releaseNo;

    /**
     * 
     */
    private Long versionId;

    /**
     * 
     */
    private Long groupId;

    /**
     * 
     */
    private Long artifactId;

    /**
     * 
     */
    private String modelUuid;

    /**
     * 
     */
    private String creator;

    /**
     * 
     */
    private Date gmtCreate;

    /**
     * 
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;
}