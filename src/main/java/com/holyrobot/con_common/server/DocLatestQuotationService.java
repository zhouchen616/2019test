package com.holyrobot.con_common.server;


import com.holyrobot.con_common.pojo.DocLatestQuotation;

import java.util.List;

/**
 * @ClassName： DocLatestQuotationService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-8-17 15:27
 * @Version: 1.0
 * @Modified By:
 */
public interface DocLatestQuotationService {

    List<DocLatestQuotation> selectByOrgId(String orgId);
}
