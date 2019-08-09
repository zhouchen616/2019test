package com.holyrobot.con_common.server;

import com.holyrobot.con_common.pojo.H5ShopComments;
import com.holyrobot.con_common.pojo.H5ShopCommentsImg;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 周相儒
 * @Description: h5评论service
 * @CreateDate: 2018/7/10 9:57
 * @Version: 1.0
 */
public interface ShopCommentService {

    void addComments(H5ShopComments shopComments, HttpServletRequest request);

    int addCommentsImg(H5ShopCommentsImg shopCommentsImg);

}
