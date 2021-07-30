package examples;


import utils.Logger;

public class StaticLoggerExample {

    public static void main(String args[]){
        Logger.info("info logs");
        Logger.debug("debug logs");
        Logger.warn("warn logs");
        Logger.error("error logs");
    }
}
