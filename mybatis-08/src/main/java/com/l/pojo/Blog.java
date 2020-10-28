package com.l.pojo;
import java.util.Date;
import lombok.Data;
@Data
public class Blog{
    /**
     * 博客id
     */
    private String id;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 博客作者
     */
    private String author;

    /**
     * 创建时间
     */
    private Date createTime;//属性名和字段名不一致 可以在设置里打开

    /**
     * 浏览量
     */
    private Integer views;
}