
package Modelo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Paola
 */
public class ImgenFondo implements Border {

    public BufferedImage back;

    public ImgenFondo() {
        try {
            URL imagen = new URL(getClass().getResource("../Imagenes/pig2.jpg").toString());
            back = ImageIO.read(imagen);
        } catch (Exception ex) {

        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth()) / 2), (y + (height - back.getHeight()) / 2), null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
