/**
*  Name: Samir Acharya
*/
package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    private RandomNumberService() {}

    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    public int generate() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.generate();
    }
}
