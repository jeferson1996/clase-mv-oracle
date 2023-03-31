package com.usa.autocar.controlador;
import com.usa.autocar.dto.cardto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class carcontrolador {

    @GetMapping("/car")
    public String obtenercarro() {
        return "hola mundo";
    }
     @PostMapping("/car")
     public void crearcarro(@RequestBody cardto cardto){
         System.out.println("crear carro");

     }

    @DeleteMapping("/car")
    public void eliminarcarro(@RequestParam int id){
        System.out.println("eliminar carro");
    }
    @PutMapping("/car")
    public void modificarcarro(@RequestBody cardto cardto){
        System.out.println("modificar carro");
    }
}
