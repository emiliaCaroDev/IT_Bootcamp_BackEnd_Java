package com.example.numeroRomano;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomanoController {

    @GetMapping("/{decimal}")
    public String convertirDecimalARomano(@PathVariable Integer decimal){
        String result="";
        switch(decimal){
            case 1:
                result = "I";
                break;
            case 2:
                result="II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result="IV";
                break;
            case 5:
                result = "V";
                break;
            case 7:
                result="VII";
                break;
            case 10:
                result = "X";
                break;
            case 13:
                result="XIII";
                break;
            case 50:
                result = "L";
                break;
            case 100:
                result="C";
                break;
            case 500:
                result = "D";
                break;
            case 1000:
                result="M";
                break;
        }
        return result;
    }
}
