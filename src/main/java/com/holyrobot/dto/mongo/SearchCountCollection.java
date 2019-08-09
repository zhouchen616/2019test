package com.holyrobot.dto.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @ClassName： SearchCountCollection
 * @Description: 对用户键入信息进行计数
 * @Author: 史迪旻
 * @Date: Created in 2018-7-5 19:31
 * @Version: 1.0
 * @Modified By:
 */

@Data
@Document(collection = "H5SpSearchCountCollection")
public class SearchCountCollection implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String count;

    private String date;
}
