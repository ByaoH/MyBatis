package com.l.dao;

import com.l.pojo.Blog;
import org.apache.ibatis.cache.Cache;

import java.util.List;
import java.util.Map;

public interface BlogMapper extends Cache {
    int addBook(Blog blog);

//    查询博客
    List<Blog> queryBlogIF(Map map);
}
