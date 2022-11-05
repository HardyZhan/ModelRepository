package com.hardy.modelrepository.dao.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName group
 */
@Data
public class Group implements Serializable {
    /**
     * 
     */
    private Long groupId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Long organizationId;

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