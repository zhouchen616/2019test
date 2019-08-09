package com.holyrobot.dto.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


/**
 * @ClassName： SearchHistoryCollection
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-7-5 14:13
 * @Version: 1.0
 * @Modified By:
 */

@Data
@Document(collection = "H5SpSearchHistoryCollection")
public class SearchHistoryCollection implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String keywords;

    private String date;

    private String userId;

    private String timestamp;
}
