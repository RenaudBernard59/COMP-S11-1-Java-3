/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packaheException;

/**
 *
 * @author renob
 */
public class TropDeau extends Exception {
    final public static int LIMITE = 100;
    /**
     * Creates a new instance of <code>TropDeau</code> without detail message.
     */
    public TropDeau() {
        super("Trop d'eau ! Vous avez dépassé la limite de : " + LIMITE);
    }

    /**
     * Constructs an instance of <code>TropDeau</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public TropDeau(String msg) {
        super(msg + " : " + LIMITE);
    }
}
