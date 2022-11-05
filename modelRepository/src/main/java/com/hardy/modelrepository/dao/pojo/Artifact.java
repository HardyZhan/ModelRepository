package com.hardy.modelrepository.dao.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName artifact
 */
@Data
public class Artifact implements Serializable {
    /**
     * 
     */
    private Long artifactId;

    /**
     * 
     */
    private Long groupId;

    /**
     * 
     */
    private String groupName;

    /**
     * 
     */
    private String name;

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