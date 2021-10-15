package principal.paint.Style;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * viernes 15, octubre 2021
 * @author juanm
 */
public class Style {
    
    public Style(javax.swing.JFrame frame){
        this.interfazWindows(frame);
    }
    
    private void interfazWindows(javax.swing.JFrame frame){
        /*
            UIManager es una clase java que contiene mucha de la información que 
            necesita java para construir los botones, ventanas y demás.
            A partir de este, podemos definir el estilo que queremos para
            el programa
            -----------------------------------------------------------------------
            setLookAndFeel() podemos establecer el estilo del programa
            como parametro se le pasa el nombre de la clase del Look and Feel
            de nuestro sistema-como este es windows seria lo mismo usar
                            --{ WindowsLookAndFeel }--
        */
        try{
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
            /*
                Para hacer que los componentes existente, reflejen el nuevo aspecto
                y comportamiento, se llama al método SwingUtilities updateComponentTreeUI 
                siendo como parametro this (el frame) para modificarlo
                de esta manera como es el frame base se modifica todos los frames hijos(no herencia)
            */
            SwingUtilities.updateComponentTreeUI(frame);
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ignored){
        }
    }
}
