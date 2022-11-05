package com.hardy.modelrepository.dao.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName metadata
 */
@Data
public class Metadata implements Serializable {
    /**
     * 
     */
    private Long metaId;

    /**
     * 
     */
    private Long versionId;

    /**
     * 
     */
    private String metaKey;

    /**
     * 
     */
    private String metaValue;

    /**
     * 
     */
    private String creator;

    /**
     * 
     */
    private Date gmtCreate;

    private static final long serialVersionUID = 1L;
}