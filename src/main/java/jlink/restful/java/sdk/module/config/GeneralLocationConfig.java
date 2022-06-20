package jlink.restful.java.sdk.module.config;

import com.google.gson.annotations.SerializedName;

/**
 * localized configuration
 *
 * @author hjm
 * @date 2022/06/10
 */
public class GeneralLocationConfig extends DeviceConfig {
    @SerializedName("General.Location")
    protected GeneralLocationDTO generalLocationDTO;
    /**
     * name
     */
    @SerializedName("Name")
    protected String name;
    /**
     * ret
     */
    @SerializedName("Ret")
    protected Integer ret;
    /**
     * ret
     */
    @SerializedName("RetMsg")
    protected String retMsg;

    /**
     * sessionId
     */
    @SerializedName("SessionID")
    protected String sessionId;

    public static class GeneralLocationDTO {
        /**
         * DST end time
         */
        @SerializedName("DSTEnd")
        private DSTEndDTO dSTEnd;
        /**
         * Daylight Savings Time Rules Off,On
         */
        @SerializedName("DSTRule")
        private String dSTRule;
        /**
         * Daylight saving time start time
         */
        @SerializedName("DSTStart")
        private DSTStartDTO dSTStart;
        /**
         * date format "MMDDYY","DDMMYY","YYMMDD"
         */
        @SerializedName("DateFormat")
        private String dateFormat;
        /**
         * date separator "-"  "/"  "."
         */
        @SerializedName("DateSeparator")
        private String dateSeparator;
        /**
         * Standby time
         */
        @SerializedName("IranCalendar")
        private Integer iranCalendar;
        /**
         * language selection。"English","SimpChinese","TradChinese","Italian","Spanish","Japanese",
         */
        @SerializedName("Language")
        private String language;
        /**
         * timeFormat  "24","12"
         */
        @SerializedName("TimeFormat")
        private String timeFormat;
        /**
         * videoFormat："PAL","NTSC","SECAM"
         */
        @SerializedName("VideoFormat")
        private String videoFormat;
        /**
         * Daylight saving time display  YMD
         */
        @SerializedName("Week")
        private Object week;
        /**
         * workDay
         */
        @SerializedName("WorkDay")
        private Integer workDay;

        public DSTEndDTO getDSTEnd() {
            return dSTEnd;
        }

        public void setDSTEnd(DSTEndDTO dSTEnd) {
            this.dSTEnd = dSTEnd;
        }

        public String getDSTRule() {
            return dSTRule;
        }

        public void setDSTRule(String dSTRule) {
            this.dSTRule = dSTRule;
        }

        public DSTStartDTO getDSTStart() {
            return dSTStart;
        }

        public void setDSTStart(DSTStartDTO dSTStart) {
            this.dSTStart = dSTStart;
        }

        public String getDateFormat() {
            return dateFormat;
        }

        public void setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
        }

        public String getDateSeparator() {
            return dateSeparator;
        }

        public void setDateSeparator(String dateSeparator) {
            this.dateSeparator = dateSeparator;
        }

        public Integer getIranCalendar() {
            return iranCalendar;
        }

        public void setIranCalendar(Integer iranCalendar) {
            this.iranCalendar = iranCalendar;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getTimeFormat() {
            return timeFormat;
        }

        public void setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
        }

        public String getVideoFormat() {
            return videoFormat;
        }

        public void setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
        }

        public Object getWeek() {
            return week;
        }

        public void setWeek(Object week) {
            this.week = week;
        }

        public Integer getWorkDay() {
            return workDay;
        }

        public void setWorkDay(Integer workDay) {
            this.workDay = workDay;
        }

        public static class DSTEndDTO {
            /**
             * day
             */
            @SerializedName("Day")
            private Integer day;
            /**
             * hour
             */
            @SerializedName("Hour")
            private Integer hour;
            /**
             * minute
             */
            @SerializedName("Minute")
            private Integer minute;
            /**
             * month
             */
            @SerializedName("Month")
            private Integer month;
            /**
             * week
             */
            @SerializedName("Week")
            private Integer week;
            /**
             * year
             */
            @SerializedName("Year")
            private Integer year;

            public Integer getDay() {
                return day;
            }

            public void setDay(Integer day) {
                this.day = day;
            }

            public Integer getHour() {
                return hour;
            }

            public void setHour(Integer hour) {
                this.hour = hour;
            }

            public Integer getMinute() {
                return minute;
            }

            public void setMinute(Integer minute) {
                this.minute = minute;
            }

            public Integer getMonth() {
                return month;
            }

            public void setMonth(Integer month) {
                this.month = month;
            }

            public Integer getWeek() {
                return week;
            }

            public void setWeek(Integer week) {
                this.week = week;
            }

            public Integer getYear() {
                return year;
            }

            public void setYear(Integer year) {
                this.year = year;
            }
        }

        public static class DSTStartDTO {
            @SerializedName("Day")
            private Integer day;
            @SerializedName("Hour")
            private Integer hour;
            @SerializedName("Minute")
            private Integer minute;
            @SerializedName("Month")
            private Integer month;
            @SerializedName("Week")
            private Integer week;
            @SerializedName("Year")
            private Integer year;

            public Integer getDay() {
                return day;
            }

            public void setDay(Integer day) {
                this.day = day;
            }

            public Integer getHour() {
                return hour;
            }

            public void setHour(Integer hour) {
                this.hour = hour;
            }

            public Integer getMinute() {
                return minute;
            }

            public void setMinute(Integer minute) {
                this.minute = minute;
            }

            public Integer getMonth() {
                return month;
            }

            public void setMonth(Integer month) {
                this.month = month;
            }

            public Integer getWeek() {
                return week;
            }

            public void setWeek(Integer week) {
                this.week = week;
            }

            public Integer getYear() {
                return year;
            }

            public void setYear(Integer year) {
                this.year = year;
            }
        }
    }

    public GeneralLocationDTO getGeneralLocationDTO() {
        return generalLocationDTO;
    }

    public void setGeneralLocationDTO(GeneralLocationDTO generalLocationDTO) {
        this.generalLocationDTO = generalLocationDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRet() {
        return ret;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public String getSessionId() {
        return sessionId;
    }
}
