package co.develhope.swagger2.controllers;
import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/math")
class MathController{

    @GetMapping(value = "")
    public String  welcomeMathMsg(){
        return "Hello everyone to math";
    }

    @GetMapping (value = "division-info")
    public ArithmeticOperation getArithmeticOp() {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setName("Divison");
        arithmeticOperation.setMinNumberOfOperands(2);
        arithmeticOperation.setDescription("dividend / divisor = quotient");
        arithmeticOperation.setProperties(new String[]{"['invariant property, distributive property']"});
        return arithmeticOperation;
    }

    @GetMapping(value = "/multiplication")
    public int multiplication(@RequestParam int multiplying, @RequestParam int multiplier) {
        return multiplying *  multiplier;
    }

    @GetMapping(value = "square/{n}")
    public int square(@RequestParam int n){
        return n*n;
    }


}