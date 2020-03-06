package com.leyou.item.service;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;

import java.util.List;

public interface SpecificationService {

    public List<SpecGroup> queryGroupsByCid(Long cid);

    public List<SpecParam> queryParams(Long gid,Long cid,Boolean generic,Boolean searching);

    List<SpecGroup> querySpecsByCid(Long cid);

}
