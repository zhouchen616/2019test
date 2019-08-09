package com.holyrobot.con_common.server.impl;

import com.holyrobot.con_common.mapper.H5ShopCommentsImgMapper;
import com.holyrobot.con_common.mapper.H5ShopCommentsMapper;
import com.holyrobot.con_common.pojo.H5ShopComments;
import com.holyrobot.con_common.pojo.H5ShopCommentsImg;
import com.holyrobot.con_common.server.ShopCommentService;
import com.holyrobot.con_order.mapper.OrdOrderinfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author: 周相儒
 * @Description: h评论实现类
 * @CreateDate: 2018/7/10 9:58
 * @Version: 1.0
 */

@Slf4j
@Service
public class ShopCommentServiceImpl implements ShopCommentService {



    @Autowired
    private OrdOrderinfoMapper ordOrderinfoMapper;
    @Autowired
    private H5ShopCommentsMapper shopCommentsMapper;
    @Autowired
    private H5ShopCommentsImgMapper shopCommentsImgMapper;

    @Transactional
    @Override
    public void addComments(H5ShopComments shopComments , HttpServletRequest request) {

        //获取当前登录人信息
//        WxUser wxUserInfo = (WxUser) request.getSession().getAttribute("wxUserInfo");

        //封装数据
        String commentId = UUID.randomUUID().toString();
        shopComments.setId(commentId);
        shopComments.setCreatedate(new Date());
//        shopComments.setCreateid(wxUserInfo.getUserId());
//        shopComments.setCreatername(wxUserInfo.getNickname());
        try {
            log.info("开始插入评论！");
            shopCommentsMapper.insert(shopComments);

            List<H5ShopCommentsImg> shopCommentsImgs = new ArrayList<>();
            String imgurls = shopComments.getImgurls();
            List<String> imgs = new ArrayList<>();
            if (StringUtils.isNotBlank(imgurls)){
                String[] split = imgurls.trim().split(",");
                Collections.addAll(imgs, split);
            }
            for (String img : imgs){
                H5ShopCommentsImg shopCommentsImg = new H5ShopCommentsImg();
                shopCommentsImg.setCommentid(commentId);
                shopCommentsImg.setId(UUID.randomUUID().toString());
                shopCommentsImg.setCreatedate(new Date());
                shopCommentsImg.setImgurl(img);
                shopCommentsImgs.add(shopCommentsImg);
            }
            log.info("开始插入图片！");
            if (!shopCommentsImgs.isEmpty()){
                for (H5ShopCommentsImg shopCommentsImg : shopCommentsImgs){
                    shopCommentsImgMapper.insert(shopCommentsImg);
                }
            }
        } catch (RuntimeException e){
            throw new RuntimeException("数据操作异常!");
        }
    }

    @Override
    public int addCommentsImg(H5ShopCommentsImg shopCommentsImg) {
        return shopCommentsImgMapper.insert(shopCommentsImg);
    }
}
