package com.holyrobot.con_common.server.impl;

import com.holyrobot.con_common.mapper.DocLatestQuotationMapper;
import com.holyrobot.con_common.pojo.DocLatestQuotation;
import com.holyrobot.con_common.server.DocLatestQuotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName： DocLatestQuotationServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-17 15:28
 * @Version: 1.0
 * @Modified By:
 */
@Service
public class DocLatestQuotationServiceImpl implements DocLatestQuotationService {

    @Autowired
    DocLatestQuotationMapper docLatestQuotationMapper;

    /**
     *
     * @Description: 通过OrgId查询获得信息
     *
     * @auther: 史迪旻
     * @date: 15:32 2018-8-17
     * @param: [Orgid]
     * @return: java.util.List<com.holyrobot.con_common.pojo.DocLatestQuotation>
     *
     */
    @Override
    public List<DocLatestQuotation> selectByOrgId(String orgId) {
        List<DocLatestQuotation> docLatestQuotations = docLatestQuotationMapper.selectByOrgId(orgId);
        return docLatestQuotations;
    }
}
