package pro.sky.maven_calc.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.maven_calc.Services.CalcService;

@RestController
@RequestMapping ("calculator")
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }

    @GetMapping
    public String welcome(){
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("plus")
    public String plus (@RequestParam(required = false) Integer num1,@RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null){
            return "Не введен один из аргументов!";
        }

        int result = calcService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }
    @GetMapping("minus")
    public String minus (@RequestParam(required = false) Integer num1,@RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null){
            return "Не введен один из аргументов!";
        }

        int result = calcService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }
    @GetMapping("multiply")
    public String multiply (@RequestParam(required = false) Integer num1,@RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null){
            return "Не введен один из аргументов!";
        }

        int result = calcService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }
    @GetMapping("divide")
    public String divide (@RequestParam(required = false) Integer num1,@RequestParam(required = false) Integer num2){
        if (num1 == null || num2 == null){
            return "Не введен один из аргументов!";
        }
        if (num2 == 0){
            return "Деление на ноль!";
        }

        int result = calcService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }

}
