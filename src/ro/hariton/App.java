/*
 * This entire project is property of their (first and for now unique) author: Hariton Andrei Marius.
 * You can’t copy and redistribute the material in any medium or format, for any purpose, except if authorized by the author of the material.
 * Copyright: Hariton Andrei Marius. All rights reserved.
 */
package ro.hariton;

import ro.hariton.threads.PrincipalThread;

/**
 * Application's starting file
 *
 * @author Hariton Andrei Marius
 */
class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t = new Thread(new PrincipalThread());
        t.start();
    }
}
