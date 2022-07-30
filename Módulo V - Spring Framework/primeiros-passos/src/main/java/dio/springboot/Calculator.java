package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public double sum(double n1, double n2) {
        return n1 + n2;
    }
}
