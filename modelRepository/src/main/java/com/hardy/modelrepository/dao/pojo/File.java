package com.hardy.modelrepository.dao.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName file
 */
@Data
public class File implements Serializable {
    /**
     * 
     */
    private Long fileId;

    /**
     * 
     */
    private Long versionId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String sha256;

    private static final long serialVersionUID = 1L;
}