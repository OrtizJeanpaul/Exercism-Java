public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private int logType;

    LogLevel(int logType){
        this.logType = logType;
    }

    public int getLogType(){
        return this.logType;
    }
}
