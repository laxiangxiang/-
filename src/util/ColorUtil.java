package util;

import java.awt.*;

/**
 * Created by LXX on 2019/1/14.
 */
public class ColorUtil {

    public static Color blueColor = Color.blue;
    public static Color grayColor = Color.gray;
    public static Color backgroundColor = Color.decode("#eeeeee");
    public static Color warningColor = Color.RED;

    public static Color getByPercentage(int per){
        if (per > 100){
            per = 100;
        }
        int r = 51;
        int g = 255;
        int b = 51;
        float rate = per / 100f ;
        r = (int) ((255 - 51) * rate + 51);
        g = 255 -r + 51;
        Color color = new Color(r,g,b);
        return  color;
    }
}
