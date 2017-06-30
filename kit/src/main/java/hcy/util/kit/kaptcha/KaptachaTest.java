package hcy.util.kit.kaptcha;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

public class KaptachaTest {
	
	public static void main(String[] args) {
		DefaultKaptcha captchaPro = new DefaultKaptcha();
        Properties p = new Properties();
        p.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, "255,103,0");
        p.setProperty(Constants.KAPTCHA_NOISE_COLOR, "yellow");
        p.setProperty(Constants.KAPTCHA_BACKGROUND_CLR_FROM, "white");
        p.setProperty(Constants.KAPTCHA_BACKGROUND_CLR_TO, "white");
        p.setProperty(Constants.KAPTCHA_IMAGE_WIDTH, "140");
        p.setProperty(Constants.KAPTCHA_IMAGE_HEIGHT, "50");
        p.setProperty(Constants.KAPTCHA_BORDER, "no");
        p.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING,"0123456789");
        p.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, "4");
        captchaPro.setConfig(new Config(p));
        String text = captchaPro.createText();
//        cache.set(codeParam.getId(), text, 200);
        BufferedImage img = captchaPro.createImage(text);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(img, "jpg", baos);
            baos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return baos.toByteArray().as("image/jpg");
	}

}
