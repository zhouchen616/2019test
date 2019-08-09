package com.holyrobot.util.qrcode;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.holyrobot.exception.QRParamsException;
import org.apache.commons.lang3.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;


/**
 * @author 周陈
 * @Title: 生成二维码的工具
 * @date 2018/7/4 16:08
 */
public class QRCodeUtil {
    private static int width = 250;              //二维码宽度
    private static int height = 250;             //二维码高度
    private static int widthB = 300;              //B二维码宽度
    private static int heightB = 400;             //B二维码高度
    private static int onColor = 0xFF000000;     //前景色
    private static int offColor = 0xFFFFFFFF;    //背景色
    private static int margin = 0;               //白边大小，取值范围0~4
    private static ErrorCorrectionLevel level = ErrorCorrectionLevel.Q;  //二维码容错率

    /**
     * 生成二维码
     *
     * @param params QRCodeParams属性：txt、fileName、filePath不得为空；
     * @throws QRParamsException
     */
    public static void generateQRImage(QRCodeParams params) throws QRParamsException {
        if (params == null
                || params.getFileName() == null
                || params.getFilePath() == null
                || params.getTxt() == null) {

            throw new QRParamsException("参数错误");
        }
        try {
            initData(params);

            String imgPath = params.getFilePath();
            String imgName = params.getFileName();
            String txt = params.getTxt();

            if (params.getLogoPath() != null && !"".equals(params.getLogoPath().trim())) {
                generateQRImage(txt, params.getLogoPath(), imgPath, imgName, params.getSuffixName());
            } else {
                generateQRImage(txt, imgPath, imgName, params.getSuffixName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 生成二维码
     *
     * @param txt     //二维码内容
     * @param imgPath //二维码保存物理路径
     * @param imgName //二维码文件名称
     * @param suffix  //图片后缀名
     */
    public static void generateQRImage(String txt, String imgPath, String imgName, String suffix) {

        File filePath = new File(imgPath);
        if (!filePath.exists()) {
            filePath.mkdirs();
        }

        File imageFile = new File(imgPath, imgName);
        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        // 指定纠错等级
        hints.put(EncodeHintType.ERROR_CORRECTION, level);
        // 指定编码格式
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.MARGIN, margin);   //设置白边
        try {
            MatrixToImageConfig config = new MatrixToImageConfig(onColor, offColor);
            BitMatrix bitMatrix = new MultiFormatWriter().encode(txt, BarcodeFormat.QR_CODE, width, height, hints);
//        	bitMatrix = deleteWhite(bitMatrix);
            MatrixToImageWriter.writeToPath(bitMatrix, suffix, imageFile.toPath(), config);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成带logo的二维码图片
     *
     * @param txt      //二维码内容
     * @param logoPath //logo绝对物理路径
     * @param imgPath  //二维码保存绝对物理路径
     * @param imgName  //二维码文件名称
     * @param suffix   //图片后缀名
     * @throws Exception
     */
    public static void generateQRImage(String txt, String logoPath, String imgPath, String imgName, String suffix) throws Exception {

        File filePath = new File(imgPath);
        if (!filePath.exists()) {
            filePath.mkdirs();
        }

        if (imgPath.endsWith("/")) {
            imgPath += imgName;
        } else {
            imgPath += "/" + imgName;
        }

        Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, level);
        hints.put(EncodeHintType.MARGIN, margin);  //设置白边
        BitMatrix bitMatrix = new MultiFormatWriter().encode(txt, BarcodeFormat.QR_CODE, width, height, hints);
        File qrcodeFile = new File(imgPath);
        writeToFile(bitMatrix, suffix, qrcodeFile, logoPath);
    }

    /**
     * @param matrix   二维码矩阵相关
     * @param format   二维码图片格式
     * @param file     二维码图片文件
     * @param logoPath logo路径
     * @throws IOException
     */
    public static void writeToFile(BitMatrix matrix, String format, File file, String logoPath) throws IOException {
        BufferedImage image = toBufferedImage(matrix);
        Graphics2D gs = image.createGraphics();

        int ratioWidth = image.getWidth() * 2 / 10;
        int ratioHeight = image.getHeight() * 2 / 10;
        //载入logo
        Image img = ImageIO.read(new File(logoPath));
        int logoWidth = img.getWidth(null) > ratioWidth ? ratioWidth : img.getWidth(null);
        int logoHeight = img.getHeight(null) > ratioHeight ? ratioHeight : img.getHeight(null);

        int x = (image.getWidth() - logoWidth) / 2;
        int y = (image.getHeight() - logoHeight) / 2;

        gs.drawImage(img, x, y, logoWidth, logoHeight, null);
        gs.setColor(Color.black);
        gs.setBackground(Color.WHITE);
        gs.dispose();
        img.flush();
        if (!ImageIO.write(image, format, file)) {
            throw new IOException("Could not write an image of format " + format + " to " + file);
        }
    }

    public static BufferedImage toBufferedImage(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, matrix.get(x, y) ? onColor : offColor);
            }
        }
        return image;
    }

    public static BitMatrix deleteWhite(BitMatrix matrix) {
        int[] rec = matrix.getEnclosingRectangle();
        int resWidth = rec[2] + 1;
        int resHeight = rec[3] + 1;

        BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
        resMatrix.clear();
        for (int i = 0; i < resWidth; i++) {
            for (int j = 0; j < resHeight; j++) {
                if (matrix.get(i + rec[0], j + rec[1]))
                    resMatrix.set(i, j);
            }
        }
        return resMatrix;
    }

    private static void initData(QRCodeParams params) {
        if (params.getWidth() != null) {
            width = params.getWidth();
        }
        if (params.getHeight() != null) {
            height = params.getHeight();
        }
        if (params.getOnColor() != null) {
            onColor = params.getOnColor();
        }
        if (params.getOffColor() != null) {
            offColor = params.getOffColor();
        }
        if (params.getLevel() != null) {
            level = params.getLevel();
        }

    }

    /**
     * @param logoFile loge图片的路径
     * @param codeFile 图片输出路径
     * @param qrUrl    二维码内容
     * @param words    二维码下面的文字
     * @description 生成带logo的二维码图片 二维码下面带文字
     */
    public static void drawLogoQRCode(File logoFile, File codeFile, String qrUrl, String words) {
        try {
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            // 参数顺序分别为：编码内容，编码类型，生成图片宽度，生成图片高度，设置参数
            BitMatrix bm = multiFormatWriter.encode(qrUrl, BarcodeFormat.QR_CODE, width, height, hints);
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            // 开始利用二维码数据创建Bitmap图片，分别设为黑（0xFFFFFFFF）白（0xFF000000）两色
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    image.setRGB(x, y, bm.get(x, y) ? onColor : offColor);
                }
            }

            //把logo画到二维码上面
            if (Objects.nonNull(logoFile) && logoFile.exists()) {
                // 构建绘图对象
                Graphics2D g = image.createGraphics();
                setGraphics2D(g);
                // 读取Logo图片
                BufferedImage logo = ImageIO.read(logoFile);
                // 开始绘制logo图片 等比缩放：（width * 2 / 10 height * 2 / 10）不需缩放直接使用图片宽高
                //width * 2 / 5 height * 2 / 5  logo绘制在中心点位置
                g.drawImage(logo, width * 2 / 5, height * 2 / 5, logo.getWidth(), logo.getHeight(), null);
                g.dispose();
                logo.flush();
            }
//            System.out.println(words+"0");
            // 新的图片，把带logo的二维码下面加上文字
            image = insertWords(image, words);
            image.flush();
            ImageIO.write(image, "png", codeFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String imgName = "volunteer_" + ".jpg";
        String url ="test";
        File file = new File("E:\\h5\\userinfo\\" + imgName);
        QRCodeUtil.drawLogoQRCode(null, file, url, "一二三四五六七");
    }


    /**
     * 用于设置QR二维码参数
     */
    private static Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>() {
        private static final long serialVersionUID = 1L;

        {
            // 设置QR二维码的纠错级别（H为最高级别）具体级别信息
            put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            // 设置编码方式
            put(EncodeHintType.CHARACTER_SET, "utf-8");
            put(EncodeHintType.MARGIN, 0);
        }
    };

    /**
     * 把带logo的二维码下面加上文字
     *
     * @param image
     * @param words
     * @return
     */
    private static BufferedImage insertWords(BufferedImage image, String words) {
        // 新的图片，二维码上面加上文字
        if (StringUtils.isNotEmpty(words)) {
            try {
//                    System.out.println(words+"1");
                words = new String(new String(words.getBytes("utf-8"), "utf-8"));
//                    System.out.println(words+"2");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            //创建一个带透明色的BufferedImage对象
            BufferedImage outImage = new BufferedImage(widthB, heightB, BufferedImage.TYPE_INT_RGB);
            Graphics2D outg = outImage.createGraphics();
            setGraphics2D(outg);
            outg.setColor(Color.WHITE);//设置笔刷白色
            outg.fillRect(0, 0, 600, 600);//填充整个屏幕
            // 画二维码到新的面板
            //image:二维码，75 x，120 y,宽度，高度，
            outg.drawImage(image, 25, 140, image.getWidth(), image.getHeight(), null);
            // 设置字体颜色，黑色
//            Color color = new Color(0, 0, 0);
//            outg.setColor(Color.RED);
            outg.setColor(Color.BLACK);

            // 字体、字型、字号
            outg.setFont(new Font("黑体", Font.PLAIN, 25));

            //文字起始位置
            int wordStartX = 0;
            int wordStartY = 30;
            //处理文字
//            if (words.length() > 10) {
//                words = words.substring(0, 10) + "...";
//            }
            //文字长度
            int strWidth = outg.getFontMetrics().stringWidth(words);
            //文字占几行
            int size = words.length() / 10;
            if (size >= 1) {
                //如果长度超过一行，循环换行操作
                for (int i = 0; i < size; i++) {
                    // 画文字
                    outg.drawString(words.substring(i * 10, 10 * (i + 1)), wordStartX, wordStartY + 30 * i);
                }
/*               drawString(String str, int x, int y)
                str：文字内容
                x：左右方向上的距离
                y：上下方向上的距离*/
                outg.drawString(words.substring(size * 10, words.length()), wordStartX, wordStartY + 30 * size);
            } else {
                //如果长度只有1行，居中显示
                //总长度减去文字长度的一半  （居中显示）
                wordStartX = (widthB - strWidth) / 2;
                outg.drawString(words, wordStartX, wordStartY);
            }

            try {
                outg.setFont(new Font("黑体", Font.BOLD, 20));
                outg.drawString(new String(new String("长按可识别二维码并保存图片".getBytes("utf-8"), "utf-8")), 15, 120);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            outg.dispose();
            outImage.flush();
            return outImage;
        }
        return null;
    }

    /**
     * 设置 Graphics2D 属性  （抗锯齿）
     *
     * @param graphics2D
     */
    private static void setGraphics2D(Graphics2D graphics2D) {
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        Stroke s = new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        graphics2D.setStroke(s);

    }

}
