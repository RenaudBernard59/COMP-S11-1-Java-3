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
public class PlusDeCarottes extends Exception {

    /**
     * Creates a new instance of <code>PlusDeCarottes</code> without detail
     * message.
     */
    public PlusDeCarottes() {
        super("Plus de carottes !");
    }

    /**
     * Constructs an instance of <code>PlusDeCarottes</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PlusDeCarottes(String msg) {
        super(msg);
    }
}
