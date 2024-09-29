package pro.sky.maven_calc.Services.Impl;

import org.springframework.stereotype.Service;
import pro.sky.maven_calc.Services.CalcService;
@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1/num2;
    }
}
