/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kiett
 */
@Controller
@RequestMapping(value="/User/")
public class UserController {
    @RequestMapping(value="index")
    public String index(){
        return "User/top10";
    }
}
