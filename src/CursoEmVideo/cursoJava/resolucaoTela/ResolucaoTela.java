package CursoEmVideo.cursoJava.resolucaoTela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        System.out.println("A resolução da tela é " + dimension.width + " X " + dimension.height);
    }
}
