package com.lethanh98.demo.customlevelLog;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    // Tạo 1 level log mới
    final static Level Le_Thanh_350 = Level.forName("LeThanh-350", 350);

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("com.lethanh.example.MainTest");
        logger.info("Log Info Level");
        // show log bằng level log
        logger.log(Le_Thanh_350, "Log Le Thanh level");
    }

}
