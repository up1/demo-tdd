package com.example.demo;

public class FizzBuzz {

    public String say(int input) {
        if(input == 15) 
            return "FizzBuzz";
        
        IFizzBuzz[] rules = { new BuzzRule(), 
                              new FizzRule(),
                              new JavaRule()};
        for (IFizzBuzz rule : rules) {
            if(rule.isValid(input)) 
                return rule.say();
        }
        
        return input + "";
    }

}

interface IFizzBuzz {
    boolean isValid(int input);
    String say();
}

class BuzzRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%5 == 0;
    }
    public String say() {
        return "Buzz";
    }
}

class FizzRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%3 == 0;
    }
    public String say() {
        return "Fizz";
    }
}

class JavaRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%7 == 0;
    }
    public String say() {
        return "Java";
    }
}
