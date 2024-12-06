/**
*  Name: Samir Acharya
*/

package org.howard.edu.lsp.finalexam.question2;

public class CustomRandomStrategy implements RandomNumberStrategy {
    @Override
    public int generate() {
        long seed = System.nanoTime();
        return (int) ((seed * 31 + 7) % Integer.MAX_VALUE);
    }
}
