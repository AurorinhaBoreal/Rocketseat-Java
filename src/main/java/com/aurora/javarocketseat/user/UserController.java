package com.aurora.javarocketseat.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Modifiers
 * Public
 * Private
 * Protect
*/

@RestController
@RequestMapping("/users")
public class UserController {
    
    /** Return Types
     * String (Text)
     * Integer (numbers that aren't decimals)
     * Double (decimal numbers)
     * Float (Also decimal numbers but with limitations)
     * Char (Unique characters)
     * Date (Dates LOL)
     * Void (Nothing returns)
     */


    /** 
    * Receiving the Object UserModel in the createUser class
    * It's also necessary to inform the folder path to the UserModel, to do this we can use a component called @RequestBody
    * that automacally inform that the UserModel is in the "Body" of the class
    */

    // Will add the data from the class in the browser page
    @PostMapping("/")
    public void createUser(@RequestBody UserModel UserModel) {
        System.out.println(UserModel.getUsername());
    }
}
