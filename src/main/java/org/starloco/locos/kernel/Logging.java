package org.starloco.locos.kernel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class Logging {
    private static final Logging singleton = new Logging();
    public static boolean USE_LOG = true;

    public static Logging getInstance() {
        return singleton;
    }

    public void initialize() {
    }

    public void stop() {

    }

    public void write(String name, String arg0) {
        Logger logger = LoggerFactory.getLogger(name);
        logger.info(arg0);
    }

}