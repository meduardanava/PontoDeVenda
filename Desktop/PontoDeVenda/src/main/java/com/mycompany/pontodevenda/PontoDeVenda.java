package com.mycompany.pontodevenda;

import javax.swing.JFrame;
import view.ViewPrincipal;

/**
 *
 * @author Gustavo H. Nava
 */
public class PontoDeVenda {

    public static void main(String[] args) {
        ViewPrincipal view = new ViewPrincipal();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
    }
}
