package oop.ex6.text_analysis;

import oop.ex6.SJavaException;

/**
 * Created by orrp and guybrush on 6/20/15.
 */
public class BadMethodCallException extends SJavaException{

    public String getMessage() {
        return "Error encountered in method call";
    }
}
