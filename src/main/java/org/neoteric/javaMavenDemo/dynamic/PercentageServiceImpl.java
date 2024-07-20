package org.neoteric.javaMavenDemo.dynamic;

public class PercentageServiceImpl implements PercentageService {
    @Override
    public double calculatePercentage(double obtained, double total) {
        if (total == 0) {
            throw new IllegalArgumentException("Total marks cannot be zero.");
        }
        return (obtained / total) * 100;
    }

}
