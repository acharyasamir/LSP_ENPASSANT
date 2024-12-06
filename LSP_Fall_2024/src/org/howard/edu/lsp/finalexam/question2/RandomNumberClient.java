/**
*  Name: Samir Acharya
*/
package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java's built-in random number generator
        service.setStrategy(new JavaRandomStrategy());
        System.out.println("Java Random Strategy: " + service.generate());

        // Use custom random number generator
        service.setStrategy(new CustomRandomStrategy());
        System.out.println("Custom Random Strategy: " + service.generate());
    }
}
