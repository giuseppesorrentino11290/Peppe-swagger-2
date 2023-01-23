package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/math")
    public String welcomeMathMessage(){
        return " Ciao questo è il Controller Matematico ";

    }

    @GetMapping(value = "/math/division-info")
    public ArithmeticOperation divisionInfo(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setName(" Divisione ");
        arithmeticOperation.setMinNumberOfOperands(2);
        arithmeticOperation.setDescription(" Calcoliamo una divisione");
        arithmeticOperation.setProperties(new String[]{ " Distributiva", " Invariantiva"});


        return arithmeticOperation;
    }
    @GetMapping(value = "/math/multiplication")
    public Integer multiplication(@RequestParam int m, @RequestParam int m2){

        return m * m2;
    }
    @GetMapping (value ="/math/square/{n}")
    public Integer square(@PathVariable int n){
        return n *n ;
    }

}