package com.hardy.modelrepository.dao.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName version
 */
@Data
public class Version implements Serializable {
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
    private String artifactName;

    /**
     * 
     */
    private String uuid;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String sha256;

    /**
     * 
     */
    private String uri;

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