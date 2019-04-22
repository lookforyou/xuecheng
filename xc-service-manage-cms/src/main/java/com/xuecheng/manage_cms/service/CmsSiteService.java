package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmsSiteService {
    @Autowired
    CmsSiteRepository cmsSiteRepository;

    public QueryResponseResult findList() {
        QueryResult<CmsSite> queryResult = new QueryResult<>();
        List<CmsSite> cmsSites = cmsSiteRepository.findAll();
        queryResult.setList(cmsSites);
        queryResult.setTotal(cmsSites.size());
        return new QueryResponseResult(CommonCode.SUCCESS, queryResult);
    }
}
