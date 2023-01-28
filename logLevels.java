public class LogLevels {
    
    public static String message(String logLine) {
        String [] message = logLine.split(" ", 2);
        return (message[1].trim());
    }

    public static String logLevel(String logLine) {
        String[] log = logLine.split(" ", 2);
        return (log[0].replace("[", "").replace("]:", "").toLowerCase());
    }

    public static String reformat(String logLine) {
        String log = logLevel(logLine);
        String [] message = logLine.split(" ", 2);
        return (message[1].trim() + " (" + log + ")");
    }
}

