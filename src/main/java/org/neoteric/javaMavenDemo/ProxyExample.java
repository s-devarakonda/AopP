package org.neoteric.javaMavenDemo;

import java.lang.reflect.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        PercentageService service = new PercentageServiceImpl();
        PercentageService proxyInstance = (PercentageService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                new Class[]{PercentageService.class},
                new LoggingInvocationHandler(service)
        );

        double obtainedMarks = 85;
        double totalMarks = 100;

        try {
            double percentage = proxyInstance.calculatePercentage(obtainedMarks, totalMarks);
            System.out.println("Calculated Percentage: " + percentage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
