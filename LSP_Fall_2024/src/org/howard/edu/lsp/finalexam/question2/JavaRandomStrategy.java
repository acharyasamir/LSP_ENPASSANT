/**
*  Name: Samir Acharya
*/
package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

public class JavaRandomStrategy implements RandomNumberStrategy {
    @Override
    public int generate() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }
}
