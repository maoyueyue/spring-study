package com.spring.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.awt.*;

public class QrCode {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
        config.setImg("E:/work.jpg");
        Color foreColor = new Color(238,110,115);
        Color bgColor = new Color(252,228,236);
        int foreColorRGB=foreColor.getRGB();
        int bgColorRGB=bgColor.getRGB();

// 设置边距，既二维码和背景之间的边距
        config.setMargin(2);
// 设置前景色，既二维码颜色（青色
        config.setForeColor(foreColorRGB);
// 设置背景色（灰色）
        config.setBackColor(bgColorRGB);

        QrCodeUtil.generate("https://www.jianshu.com/u/7b8b392e5f7d/",config,FileUtil.file("D:/qrcode.jpg"));
    }

}
