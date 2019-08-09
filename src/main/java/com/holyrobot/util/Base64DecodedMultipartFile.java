package com.holyrobot.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

//import sun.misc.BASE64Decoder;

/**
 * @Author: 周相儒
 * @Description: 重新实现MultipartFile类
 * @CreateDate: 2018/9/6 15:38
 * @Version: 1.0
 */
public class Base64DecodedMultipartFile implements MultipartFile{
    private final byte[] imgContent;
    private final String header;

    public Base64DecodedMultipartFile(byte[] imgContent, String header) {
        this.imgContent = imgContent;
        this.header = header.split(";")[0];
    }

    @Override
    public String getName() {
        // TODO - implementation depends on your requirements
        return System.currentTimeMillis() + Math.random() + "." + header.split("/")[1];
    }

    @Override
    public String getOriginalFilename() {
        // TODO - implementation depends on your requirements
        return System.currentTimeMillis() + (int)Math.random() * 10000 + "." + header.split("/")[1];
    }

    @Override
    public String getContentType() {
        // TODO - implementation depends on your requirements
        return header.split(":")[1];
    }

    @Override
    public boolean isEmpty() {
        return imgContent == null || imgContent.length == 0;
    }

    @Override
    public long getSize() {
        return imgContent.length;
    }

    @Override
    public byte[] getBytes() throws IOException {
        return imgContent;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(imgContent);
    }

    @Override
    public void transferTo(File dest) throws IOException, IllegalStateException {
        new FileOutputStream(dest).write(imgContent);
    }

    /**
     * @Author: 周相儒
     * @Description: base64转换为file
     * @Date:  2018/9/6
     * @return: MultipartFile
     * @Param: base64
     */
    public static MultipartFile base64ToMultipart(String base64) {
        String[] baseStrs = base64.split(",");

//            BASE64Decoder decoder = new BASE64Decoder();
        Base64 decoder = new Base64();
        byte[] b = new byte[0];
//            b = decoder.decodeBuffer(baseStrs[1]);
        b = decoder.decodeBase64(baseStrs[1]);

        for(int i = 0; i < b.length; ++i) {
            if (b[i] < 0) {
                b[i] += 256;
            }
        }
        return new Base64DecodedMultipartFile(b, baseStrs[0]);
    }
}
